(ns fpftoop.chapter-06-test
    (:require [clojure.test :refer :all]
              [fpftoop.chapter-06 :refer :all]))

; Exercise 1

(deftest factorial-0-test
  (testing "factorial returns 1 when passed the value 0."
    (is (= (factorial 0) 1))))

(deftest factorial-1-test
  (testing "factorial returns 1 when passed the value 1."
    (is (= (factorial 1) 1))))

(deftest factorial-2-test
  (testing "factorial returns 2 when passed the value 2."
    (is (= (factorial 2) 2))))

(deftest factorial-3-test
  (testing "factorial returns 6 when passed the value 3."
    (is (= (factorial 3) 6))))

(deftest factorial-4-test
  (testing "factorial returns 24 when passed the value 4."
    (is (= (factorial 4) 24))))

(deftest factorial-5-test
  (testing "factorial returns 120 when passed the value 5."
    (is (= (factorial 5) 120))))

; Exercise 2

(deftest factorial2-0-test
  (testing "factorial2 returns 1 when passed the value 0."
    (is (= (factorial2 0 1) 1))))

(deftest factorial2-1-test
  (testing "factorial2 returns 1 when passed the value 1."
    (is (= (factorial2 1 1) 1))))

(deftest factorial2-2-test
  (testing "factorial2 returns 2 when passed the value 2."
    (is (= (factorial2 2 1) 2))))

(deftest factorial2-3-test
  (testing "factorial2 returns 6 when passed the value 3."
    (is (= (factorial2 3 1) 6))))

(deftest factorial2-4-test
  (testing "factorial2 returns 24 when passed the value 4."
    (is (= (factorial2 4 1) 24))))

(deftest factorial2-5-test
  (testing "factorial2 returns 120 when passed the value 5."
    (is (= (factorial2 5 1) 120))))

; Exercise 3

(deftest recursive-add-test
  (testing "recursive-add returns 10 when passed the list [1 2 3 4]."
    (is (= (recursive-add [1 2 3 4] 0) 10))))

; Exercise 4

(deftest recursive-multiply-test
  (testing "recursive-multiply returns 24 when passed the list [1 2 3 4]."
    (is (= (recursive-multiply [1 2 3 4] 1) 24))))

; Exercise 5

(deftest recursive-function-test-1
  (testing "recursive-function."
    (is (= (recursive-function
             (fn [something so-far] (assoc so-far something 0)) [:a :b :c] {}) {:a 0, :b 0, :c 0}))))

(deftest recursive-function-test-2
  (testing "recursive-function."
    (is (= (recursive-function
             (fn [something so-far] (assoc so-far something (count so-far))) [:a :b :c] {}) {:a 0, :b 1, :c 2}))))
