(ns fpftoop.chapter-04-test
    (:require [clojure.test :refer :all]
              [fpftoop.chapter-04 :refer :all]))

(def point (make Point 1 2))

(deftest shift-test
  (testing "Add 2 points."
    (let [point2 (send-to point :shift 3 4)]
      (and (is (= 4 (send-to point2 :x)))
           (is (= 6 (send-to point2 :y)))))))

(deftest add-test
  (testing "Add 2 points."
    (let [point2 (make Point 3 4)
          point3 (send-to point :add point2)]
      (and (is (= 4 (send-to point3 :x)))
           (is (= 6 (send-to point3 :y)))))))
