(defproject ar-drone "0.1.9a"
  :description "Clojure Control for the AR Drone"
  :url "https://github.com/gigasquid/clj-drone"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.logging "0.2.6"]
                 [org.clojure/clojure "1.5.1"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]]
                 :plugins [[lein-midje "2.0.1"]]}})
