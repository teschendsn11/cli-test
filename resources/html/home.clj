(ns cli-test.views.home
  (:require [selmer.parser :refer :all]))

; (selmer.parser/set-resource-path! "/var/html/templates/")
(set-resource-path! (clojure.java.io/resource "/html/"))

(def home (render-file "pageTemplate.html" {
                               :head (render-file "head.html"{:title "This is my homepage"})
                               :body (render-file "1-3-1.html" {
                                                                :top_1 "gege"
                                                                :mid_1 "ssss"
                                                                :mid_2 "xxxx"
                                                                :mid_3 "cccc"
                                                                :bottom_1 "hhhh"
                                                                })
                               :header (render-file "header.html")
                               :footer (render-file "footer.html")
                              }))
