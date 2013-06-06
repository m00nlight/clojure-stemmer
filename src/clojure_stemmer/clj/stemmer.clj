;; Porter stemmer in Clojure. Few comments, but it's easy to follow using
;; the rules in the original paper, in
;;
;;    Porter, 1980, An algorithm for suffix stripping, Program,
;;    Vol. 14,no. 3, pp 130-137,
;;
;; See also http://www.tartarus.org/~martin/PorterStemmer
;; Author : m00nlight
;; Email  : dot.wangyushi@gmail.com
;; Bug reports are welcome.  Send email.

;; The New BSD license (http://en.wikipedia.org/wiki/BSD_licenses)
;; applies to this program.

;;(ns clojure-stemmer.core)

;; Change Log

;; 6/6/2013
;;      Bob Kirby: http://www.linkedin.com/in/bobkirby
;;      Improvements:
;;        1. Created regular expression at load time rather at run time
;;        2. Use "count" rather than ".length" to avoid reflection
;;        3. Renamed variables and fixed comment typos
;;        4. Suggested a more specific version of the BSD license
;;        5. Moved the test expression to the end
;;        6. Adjust the code width to fit in 80 columns for better
;;           compatibility with older editors.
;;      Thanks bob for the improvements :)

;; 20/4/2013
;;      m00nlight<dot.wangyushi@gmail.com>: first version commit

(ns clj.stemmer)

(def step-2-map
  {"ational" "ate",
   "tional" "tion",
   "enci" "ence",
   "anci" "ance",
   "izer" "ize",
   "bli" "ble",
   "alli" "al",
   "entli" "ent",
   "eli" "e",
   "ousli" "ous",
   "ization" "ize",
   "ation" "ate",
   "ator" "ate",
   "alism" "al",
   "iveness" "ive",
   "fulness" "ful",
   "ousness" "ous",
   "aliti" "al",
   "iviti" "ive",
   "biliti" "ble",
   "logi" "log"})

(def step-3-map
  {"icate" "ic",
   "ative" "",
   "alize" "al",
   "iciti" "ic",
   "ical" "ic",
   "ful" "",
   "ness" ""})

(def step-2-pattern
  (re-pattern (str "(ational|tional|enci|anci|izer|bli|alli"
                   "|entli|eli|ousli|ization|ation|ator|alism"
                   "|iveness|fulness|ousness|aliti|iviti|biliti|logi)$")))

(def step-3-pattern #"(icate|ative|alize|iciti|ical|ful|ness)$")
(def step-4-pattern
  (re-pattern (str "(al|ance|ence|er|ic|able|ible|ant|ement|ment"
                   "|ent|ou|ism|ate|iti|ous|ive|ize)$")))

(def c-str "[^aeiou]")
(def v-str "[aeiouy]")
(def C-str (str c-str "[^aeiouy]*"))
(def V-str (str v-str "[aeiou]*"))
(def mgr0-pattern
  (re-pattern (str "^(" C-str ")?" V-str C-str)))
(def meq1-pattern
  (re-pattern (str "^(" C-str ")?" V-str C-str "(" V-str ")?$")))
(def mgr1-pattern
  (re-pattern (str "^(" C-str ")?" V-str C-str V-str C-str)))
(def _v-pattern
  (re-pattern (str "^(" C-str ")?" v-str)))
(def steps-pattern
  (re-pattern (str "^" C-str v-str "[^aeiouwxy]$")))

(defn remove-last [ss rep]
  (let [ss-rev (clojure.string/reverse ss)
        rep-rev (clojure.string/reverse rep)]
    (clojure.string/reverse (clojure.string/replace-first ss-rev rep-rev ""))))

(defn get-match [w regex]
  "Test whether a word match a regex expression, if match,
return [$` $1], otherwise, return [nil nil]"
  (let [f (re-find regex w)]
    (if (not (nil? f))
      [(remove-last w (nth f 0)) (nth f 1)]
      [nil nil])))

(defn test-match? [w regex]
  (not (nil? (re-find regex w))))

(defn chop [string]
  (subs string 0 (dec (count string))))

;; step 0
(defn step0 [w]
  (if (test-match? w #"^y")
    (clojure.string/capitalize w)
    w))

;; step 1a
(defn step1-a [w]
  (let [[f1 v1] (get-match w #"(ss|i)es$")
        [f2 v2] (get-match w #"([^s])s$")]
    (cond
     f1 (str f1 v1)
     f2 (str f2 v2)
     :else w)))

;; step 1b
(defn step1-b [w]
  (let [[f1 v1] (get-match w #"eed$")
        [f2 v2] (get-match w #"(ed|ing)$")]
    (cond
     f1 (let [[f v] (get-match f1 mgr0-pattern)]
          (if f (chop w) w))
     f2 (let [[f v] (get-match f2 _v-pattern)
              stem f2]
          (cond
           (and f (test-match? stem #"(at|bl|iz)$")) (str stem "e")
           (and f (test-match? stem #"([^aeiouylsz])\1$")) (chop stem)
           (and f (test-match? stem steps-pattern)) (str stem "e")
           f stem
           :else w))
     :else w)))


;; step 1c
(defn step1-c [w]
  (let [f (re-find #"y$" w)
        stem (chop w)]
    (if (and f (test-match? stem _v-pattern))
      (str stem "i")
      w)))


(defn step23-common [w regex map-list]
  (let [[stem suffix] (get-match w regex)]
    (if (and stem (test-match? stem mgr0-pattern))
      (str stem (get map-list suffix))
      w)))

;; step 2
(defn step2 [w]
  (step23-common w step-2-pattern step-2-map))

;; step 3
(defn step3 [w]
  (step23-common w step-3-pattern step-3-map))

;; step 4
(defn step4 [w]
  (let [[stem suffix] (get-match w step-4-pattern)]
    (if (and stem (test-match? stem mgr1-pattern))
      stem
      (let [[stem2 suffix2] (get-match w #"(s|t)(ion)$")
            ss (str stem2 suffix2)]
        (if (and stem2 (test-match? ss mgr1-pattern))
          ss
          w)))))


;; step5-a
(defn step5-a [w]
  (let [f (re-find #"e$" w)]
    (if f
      (let [stem (chop w)]
        (if (or (test-match? stem mgr1-pattern)
                (and (test-match? stem meq1-pattern)
                     (not (test-match? stem steps-pattern))))
          stem
          w))
      w)))


;; step5-b
(defn step5-b [w]
  (if (and (test-match? w #"ll$") (test-match? w mgr1-pattern))
    (chop w)
    w))

;; step5 c, change the beginning Y back to y
(defn step5-c [w]
  (if (test-match? w #"^Y")
    (str "y" (subs w 1 (count w)))
    w))

(defn stemming [w]
  (if (< (count w) 3)
    w
    (-> (clojure.string/lower-case w)
        step0 step1-a step1-b step1-c
        step2 step3 step4 step5-a step5-b step5-c)))

;; load-time tests
;; (get-match "crisis" #"([^s])s$")
;; (re-find #"([^s])s$" "crisis")
;; (clojure.string/replace "crisis" "is" "")
