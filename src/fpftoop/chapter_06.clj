(ns fpftoop.chapter-06)

; Exercise 1

(defn factorial [n]
  (if (< n 2)
    1
    (* n (factorial (dec n)))))

; Exercise 2

(defn factorial2 [n so-far]
  (if (< n 2)
    so-far
    (factorial2 (dec n)
                (* n so-far))))

; Exercise 3

(defn recursive-function [combiner something so-far]
  (if (empty? something)
    so-far
    (recursive-function combiner
                        (rest something)
                        (combiner (first something) so-far))))

(defn recursive-add [something so-far]
  (recursive-function + something so-far))

; Exercise 4

(defn recursive-multiply [something so-far]
  (recursive-function * something so-far))

