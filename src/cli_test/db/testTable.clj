(ns cli-test.db.testTable
"This is the testing of database connection libraries"
  (:require [hugsql.core :as hugsql]))

(def db
  {:classname "org.postgresql.Driver"
   :subprotocol "postgresql"
   :subname "//localhost:5432/postgres"
   :currentSchema "test_clojure"
   :user "teschendsn11"
   :password "buckydorf"
   })

(hugsql/def-db-fns "cli_test/db/sql/testTable.sql")

(hugsql/def-sqlvec-fns "cli_test/db/sql/testTable.sql")

;(drop-test-table db)
;(create-test-table db)

(insert-test db {:name "Eddard"})
(insert-tests db {:names [
                          ["Regina"]
                          ["wilma"]
                          ["bilbo"]
                          ["bilbette"]
                          ]})
(->> (all-tests db)
     (map :id)
     (filter odd?)
     (clojure.string/join ", "))

;;(:name (get-test-by-id db {:id 3}))


;;(get-test-by-name db {:name "bilbo"})


