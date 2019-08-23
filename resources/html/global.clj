(ns cli-test.html.global
  (:require
   [hiccup.core :refer [html]]
   ))

(defn pageTemplate [title body]
  (html [:head [:title title]]
        [:body 
         [:div {:class "container"} body]]))

; (defn pageHead [title]
;   (+ 1 1))
