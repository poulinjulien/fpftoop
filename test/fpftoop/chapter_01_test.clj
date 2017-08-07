(ns fpftoop.chapter-01-test
    (:require [clojure.test :refer :all]
              [fpftoop.chapter-01 :refer :all]))

; Exercise 1

(deftest add-test
    (testing "Add 2 points."
        (is (= (Point 4 6) (add (Point 1 2)
                                (Point 3 4))))))

(deftest add-shift-test
    (testing "Add 2 points."
        (is (= (Point 4 6) (add-shift (Point 1 2)
                                      (Point 3 4))))))

; Exercise 2

(deftest make-test-1
    (testing "Make new point."
        (is (= (Point 4 6) (make Point 4 6)))))


(deftest make-test-2
    (testing "Make new point."
        (is (=
              (make Triangle (Point 1 2)
                             (Point 1 3)
                             (Point 3 1))
              (make Triangle (make Point 1 2)
                             (make Point 1 3)
                             (make Point 3 1))))))

; Exercise 3 & 4

(deftest equal-triangle?-test-1
    (testing "Testing if triangles are equal."
        (is (= true (equal-triangles? right-triangle right-triangle)))))

(deftest equal-triangle?-test-2
    (testing "Testing if triangles are equal."
        (is (= true (equal-triangles? right-triangle equal-right-triangle)))))

(deftest equal-triangle?-test-3
    (testing "Testing if triangles are equal."
        (is (= false (equal-triangles? right-triangle different-triangle)))))

(deftest equal-triangle?-test-4
    (testing "Testing if triangles are equal."
        (is (= false (equal-triangles? right-triangle
                                       equal-right-triangle
                                       different-triangle)))))

; Exercise 5

(deftest valid-triangle?-test-1
    (testing "Testing if triangles are equal."
        (is (= false (valid-triangle? (make Point 0 0) (make Point 0 0) (make Point 3 4))))))

(deftest valid-triangle?-test-2
    (testing "Testing if triangles are equal."
        (is (= true (valid-triangle? (make Point 0 0) (make Point 0 4) (make Point 4 0))))))

