(ns cli-test.routeUtils
  )

(defn build-route
"pass body to the route"
[body]
  (fn [reg] {:status 200
     :headers {"Content-Type" "text/html"}
     :body body}))





