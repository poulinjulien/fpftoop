(ns fpftoop.chapter-04)

(def make
  (fn [type & args]
    (apply type args)))

(def send-to
  (fn [object message & args]
    (apply (message (:__methods__ object)) object args)))

(def Point
  (fn [x y]
    {:x x,
     :y y
     :__class_symbol__ 'Point
     :__methods__ {
                   :class :__class_symbol__

                   :x (fn [this] (get this :x))
                   :y (fn [this] (get this :y))

                   :shift (fn [this xinc yinc]
                            (make Point (+ (send-to this :x) xinc)
                                  (+ (send-to this :y) yinc)))
                   :add (fn [this other]
                          (send-to this :shift
                                   (send-to other :x)
                                   (send-to other :y)))}}))
