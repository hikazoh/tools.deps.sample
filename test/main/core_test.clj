(ns main.core-test
  (:require [clojure.test :as t]
            [main.core :as sut]))

(t/deftest basic-tests
  (t/testing "it says hello to everyhone"
    (t/is (= (with-out-str (sut/-main)) "Hello,World"))))
