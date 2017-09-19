(ns fpftoop.chapter-07-test
  (:require [clojure.test :refer :all]
            [fpftoop.chapter-07 :refer :all]))

; Exercise 1

(deftest arrow-test-1
  (testing "process [1] by removing the number from the vector, incrementing it, and wrapping it in a list"
    (is (= [2] (-> [1]
                   first
                   inc
                   list)))))

; Exercise 2

(deftest arrow-test-2
  (testing "process [1] by removing the number from the vector, incrementing it, and wrapping it in a list"
    (is (= [6] (-> [1]
                   first
                   inc
                   (* 3)
                   list)))))

; Exercise 3

(deftest arrow-test-3
  (testing "process [1] by removing the number from the vector, incrementing it, and wrapping it in a list"
    (is (= 7 (-> 3
                 ((fn [n] (* 2 n)))
                 inc)))))

; Exercise 4

(deftest arrow-test-4
  (testing "process [1] by removing the number from the vector, incrementing it, and wrapping it in a list"
    (is (= 13 (-> (+ 1 2)
                  (* 3)
                  (+ 4))))))
