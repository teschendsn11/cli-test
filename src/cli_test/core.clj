(ns cli-test.core
  (:require
   [immutant.web :as web] ;; web server
   [compojure.core :refer :all] ;; Routing
   [compojure.route :as route] ;; Routing
   [selmer.parser :refer :all]
   [cli-test.routeUtils :refer [build-route]]
   [cli-test.html.home :refer [home]]
   [cli-test.db.testTable :refer [all-tests db]])
  (:gen-class :main true))

(defroutes all-routes
  ;(GET "/" [] (build-route (pageTemplate "Home page" (clojure.string/join "," (map :name (all-tests db))))))
  (GET "/" [] (build-route home)))
 ; (GET "/pathTwo" [] (build-route (pageTemplate "Second Page" "<h1>Second page</h1>")))
  ;(GET "/pathThree" [] (build-route (pageTemplate "Third Page" "<h1> SecondPage</h1>"))))
(defn -main [& args]
  (web/run all-routes {:port 8080}))
