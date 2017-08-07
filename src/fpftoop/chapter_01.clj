(ns fpftoop.chapter-01)

(def point {:x 1, :y 2, :__class_symbol__ 'Point})

(def Point
  (fn [x y]
    {:x x,
     :y y
     :__class_symbol__ 'Point}))

(def x :x)
(def y :y)
(def class-of :__class_symbol__)

(def shift
  (fn [this xinc yinc]
    (Point (+ (x this) xinc)
           (+ (y this) yinc))))

(def Triangle
  (fn [point1 point2 point3]
    {:point1 point1, :point2 point2, :point3 point3
     :__class_symbol__ 'Triangle}))


(def right-triangle (Triangle (Point 0 0)
                              (Point 0 1)
                              (Point 1 0)))

(def equal-right-triangle (Triangle (Point 0 0)
                                    (Point 0 1)
                                    (Point 1 0)))

(def different-triangle (Triangle (Point 0 0)
                                  (Point 0 10)
                                  (Point 10 0)))

; Exercise 1

(def add
  (fn [this point2]
    (Point (+ (x this) (x point2))
           (+ (y this) (y point2)))))

(def add-shift
  (fn [this point2]
    (shift this (x point2) (y point2))))

; Exercise 2

(def make
  (fn [ctor & args]
    (apply ctor args)))

; Exercise 3

(def equal-triangles? =)

; Exercise 4

; Same as exercise 3

; Exercise 5

(defn valid-triangle? [& points]
  (= (distinct points) points))