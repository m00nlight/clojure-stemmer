
;; Porter stemmer in Clojure. Few comments, but it's easy to follow against the rules in the original
;; paper, in
;;
;;    Porter, 1980, An algorithm for suffix stripping, Program, Vol. 14,no. 3, pp 130-137,
;;
;; see also http://www.tartarus.org/~martin/PorterStemmer
;; Author : m00nlight
;; Email  : dot.wangyushi@gmail.com
;; Any bug reports are welcomed to send me a email.


(ns clojure-stemmer.core)


(def step-2-list
  {"ational" "ate", "tional" "tion", "enci" "ence", "anci" "ance", "izer" "ize", "bli" "ble",
   "alli" "al", "entli" "ent", "eli" "e", "ousli" "ous", "ization" "ize", "ation" "ate",
   "ator" "ate", "alism" "al", "iveness" "ive", "fulness" "ful", "ousness" "ous", "aliti" "al",
   "iviti" "ive", "biliti" "ble", "logi" "log"})

(def step-3-list
  {"icate" "ic", "ative" "", "alize" "al", "iciti" "ic", "ical" "ic", "ful" "", "ness" ""})

(def step-2-str "(ational|tional|enci|anci|izer|bli|alli|entli|eli|ousli|ization|ation|ator|alism|iveness|fulness|ousness|aliti|iviti|biliti|logi)$")

(def step-3-str "(icate|ative|alize|iciti|ical|ful|ness)$")
(def step-4-str "(al|ance|ence|er|ic|able|ible|ant|ement|ment|ent|ou|ism|ate|iti|ous|ive|ize)$")

(def c-str "[^aeiou]")
(def v-str "[aeiouy]")
(def C-str (str c-str "[^aeiouy]*"))
(def V-str (str v-str "[aeiou]*"))
(def mgr0-str (str "^(" C-str ")?" V-str C-str))
(def meq1-str (str "^(" C-str ")?" V-str C-str "(" V-str ")?$"))
(def mgr1-str (str "^(" C-str ")?" V-str C-str V-str C-str))
(def _v-str (str "^(" C-str ")?" v-str))

(defn remove-last [ss rep]
  (let [ss-rev (clojure.string/reverse ss)
        rep-rev (clojure.string/reverse rep)]
    (clojure.string/reverse (clojure.string/replace-first ss-rev rep-rev ""))))

(defn get-match [w regex-string]
  "Test wether a word match a regex expression, if match, return [$` $1], other wise, return [nil nil]"
  (let [re (java.util.regex.Pattern/compile regex-string)
        f (re-find re w)]
    (if (not (nil? f))
      [(remove-last w (nth f 0)) (nth f 1)]
      [nil nil])))

(defn test-match? [w regex-string]
  (not (nil? (re-find (java.util.regex.Pattern/compile regex-string) w))))

(defn chop [string]
  (subs string 0 (- (.length string) 1)))

;; step 0
(defn step0 [w]
  (if (test-match? w "^y")
    (clojure.string/capitalize w)
    w))

;; step 1a
(defn step1-a [w]
  (let [[f1 v1] (get-match w "(ss|i)es$")
        [f2 v2] (get-match w "([^s])s$")]
    (cond
     f1 (str f1 v1)
     f2 (str f2 v2)
     :else w)))

(get-match "crisis" "([^s])s$")

(re-find #"([^s])s$" "crisis" )

(clojure.string/replace "crisis" "is" "")

;; step 1b
(defn step1-b [w]
  (let [[f1 v1] (get-match w "eed$")
        [f2 v2] (get-match w "(ed|ing)$")]
    (cond
     f1 (let [[f v] (get-match f1 mgr0-str)]
          (if f (chop w) w))
     f2 (let [[f v] (get-match f2 _v-str)
              stem f2]
          (cond
           (and f (test-match? stem "(at|bl|iz)$")) (str stem "e")
           (and f (test-match? stem "([^aeiouylsz])\\1$")) (chop stem)
           (and f (test-match? stem (str "^" C-str v-str "[^aeiouwxy]$"))) (str stem "e")
           f stem
           :else w))
     :else w)))


;; step 1c
(defn step1-c [w]
  (let [f (re-find #"y$" w)
        stem (chop w)]
    (if (and f (test-match? stem _v-str))
      (str stem "i")
      w)))


(defn step23-common [w regex-string map-list]
  (let [[stem suffix] (get-match w regex-string)]
    (if (and stem (test-match? stem mgr0-str))
      (str stem (get map-list suffix))
      w)))

;; step 2
(defn step2 [w]
  (step23-common w step-2-str step-2-list))

;; step 3
(defn step3 [w]
  (step23-common w step-3-str step-3-list))

;; step 4
(defn step4 [w]
  (let [[stem suffix] (get-match w step-4-str)]
    (if (and stem (test-match? stem mgr1-str))
      stem
      (let [[stem2 suffix2] (get-match w "(s|t)(ion)$")
            ss (str stem2 suffix2)]
        (if (and stem2 (test-match? ss mgr1-str))
          ss
          w)))))


;; step5-a
(defn step5-a [w]
  (let [f (re-find #"e$" w)]
    (if f
      (let [stem (chop w)]
        (if (or (test-match? stem mgr1-str)
                (and (test-match? stem meq1-str)
                     (not (test-match? stem (str "^" C-str v-str "[^aeiouwxy]$")))))
          stem
          w))
      w)))


;; step5-b
(defn step5-b [w]
  (if (and (test-match? w "ll$") (test-match? w mgr1-str))
    (chop w)
    w))

;; step5 c, change the beging Y back to y
(defn step5-c [w]
  (if (test-match? w "^Y")
    (str "y" (subs w 1 (.length w)))
    w))

(defn stemming [w]
  (if (< (.length w) 3)
    w
    (-> w step0 step1-a step1-b step1-c step2 step3 step4 step5-a step5-b step5-c)))


