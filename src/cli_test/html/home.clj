(ns cli-test.html.home
  (:require [selmer.parser :refer :all]))

(selmer.parser/set-resource-path! "C:\\Users\\Mr. PeanutButter\\Documents\\clojure\\cli-test\\src\\cli_test\\html\\")
;(set-resource-path! (clojure.java.io/resource "html/"))

(def home (render-file "pages/home.html" {
                                          :title "homepage"
                                          :body (render-file "layouts/1-3-1.html" {:top_1 "gege"
                                                                                   :mid_1 "ssss"
                                                                                   :mid_2 "xxxx"
                                                                                   :mid_3 "cccc"
                                                                                   :bottom_1 "hhhh"})
                                          :header (render-file "components/header.html" nil)
                                          :footer (render "<div>{{ my_data }}</div>", {:my_data "test"})}))
