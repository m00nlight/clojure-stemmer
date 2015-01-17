(defproject clojure-stemmer "0.1.0"
  :description "Clojure Implementation of Porter Stemming Algorithm"
  :url "http://bitbucket.org/m00nlight/clojure-stemmer"
  :license {:name "new BSD License"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :scm {:name "git"
        :url "http://www.eclipse.org/legal/epl-v10.html"}
  :signing {:gpg-key "dot_wangyushi@yeah.net"}
  :deploy-repositories [["clojars" {:creds :gpg}]])
