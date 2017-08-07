(defproject fpftoop "0.1.0-SNAPSHOT"
  :description "Exercises from the book 'Functional Programming for the Object-Oriented Programmer'"
  :url ""
  :license {:name ""
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot fpftoop.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
