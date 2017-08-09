(ns fpftoop.chapter-01-test
    (:require [clojure.test :refer :all]
              [fpftoop.chapter-01 :refer :all]))

(deftest second-test
    (testing "Second returns the 2nd element of a list."
        (is (= 2 (second2 '(1 2 3 4))))))

(deftest third1-test
    (testing "Third1 returns the 3rd element of a list."
        (is (= 3 (third1 '(1 2 3 4))))))

(deftest third2-test
    (testing "Third2 returns the 3rd element of a list."
        (is (= 3 (third2 '(1 2 3 4))))))

(deftest add-squares-test
    (testing "add-squares returns the sum of the squares of all the elements of a list."
        (is (= 30 (add-squares '[1 2 3 4])))))

(deftest factorial-test
    (testing "factorial"
        (is (= 120 (factorial 5)))))

(deftest prefix-of?-test1
    (testing "prefix-of?"
        (is (= true (prefix-of? [1 2] [1 2 3 4])))))

(deftest prefix-of?-test2
    (testing "prefix-of?"
        (is (= false (prefix-of? '(2 3) [1 2 3 4])))))

(deftest prefix-of?-test3
    (testing "prefix-of?"
        (is (= true (prefix-of? '(1 2) [1 2 3 4])))))

(deftest tails-test3
    (testing "tails"
        (is (= (tails '(1 2 3 4))
               '((1 2 3 4) (2 3 4) (3 4) (4) ())))))

