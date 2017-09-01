(ns fpftoop.chapter-05-test
    (:require [clojure.test :refer :all]
              [fpftoop.chapter-05 :refer :all]))

;Exercise 1

(deftest make-test
  (testing "Construct a Point."
    (let [point (make Point 1 2)]
      (and (is (= 1 (:x point)))
           (is (= 2 (:y point)))))))

(deftest send-to-test
  (testing "Shift a Point."
    (let [point (send-to (make Point 1 2) :shift -1 -2)]
      (and (is (= 2 (:x point)))
           (is (= 4 (:y point)))))))





; Exercise 4
(deftest accessor-test
  (testing "Define an accessor."
      (= "stuff" (send-to (make Holder "stuff") :held))))

