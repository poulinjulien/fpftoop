(ns fpftoop.chapter-00)

; Exercise 1 [19]
; clojure.core already contains a 'second' function , so I used 'second2' as the name
(def second2
  (fn [list]
    (first (rest list))))

; Exercise 2 [19]
(def third1
  (fn [list]
    (first (rest (rest list)))))

(def third2
  (fn [list]
    (nth list 2)))

; Exercise 3: implement add-squares
(def add-squares
  (fn [li]
    (apply + (map * li li))))

; Exercise 4: implement factorial
(def factorial
  (fn [n]
    (apply * (range 1 (inc n)))))

; Exercise 6: implement factorial
(def prefix-of?
  (fn [candidate sequence]
    (every? true? (map = candidate sequence))))

; Exercise 7: tails
;(def tails
;  (fn [list]
;    (map (range 0 (count list)))))

(def tails
  (fn [seq]
    (map drop
         (range (inc (count seq)))
         (repeat (inc (count seq)) seq))))
