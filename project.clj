(defproject cli-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :main cli-test.core
  :license {:name "EPL-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.3.1"]
                 [org.immutant/immutant "2.1.10"]
                 [compojure "1.6.1"]
                 [com.layerware/hugsql "0.4.9"]
                 [org.postgresql/postgresql "42.2.2"]
                 [selmer "1.12.5"]
                 [hiccup "1.0.5"]]
  :repl-options {:init-ns cli-test.core})
