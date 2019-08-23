/* psql -U teschendsn11 -d postgres -f testTable.sql */

-- SET schema 'test_clojure';

-- :name drop-test-table :!
-- :doc Delete characters table
DROP TABLE if exists my_clj

-- :name create-test-table :!
-- :doc Create characters table
CREATE TABLE my_clj (
    id 		serial PRIMARY KEY,
    name 	text not null
)

-- :name insert-test :! :n
-- :doc insert a name test
insert into my_clj (name)
values (:name)

-- :name insert-tests :! :n
-- :doc insert names into test
insert into my_clj (name)
values :tuple*:names

/*VALUES ('max Smith'),
       ('June Lee'),
       ('millie Smith'),
       ('June Jones'),
       ('Max Pain'),
       ('Jane Rodgers'),
       ('Steve Willy'),
       ('Corbin Burnes');*/

-- :name all-tests :? :*  	
-- :doc Got All names
select * from my_clj

-- :name get-test-by-id :? :1
-- :doc get record by id
select name from my_clj
where id = :id

-- :name get-test-by-name 
-- :doc get record by name
select id from my_clj
where name = :name

