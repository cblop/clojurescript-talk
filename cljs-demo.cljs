;; namespaces provide modularity
(ns cljs-demo)

;; prefix notation: functions on left, arguments on right

(+ 2 4 5)

;; definining functions
;; last line is return value
;; named
(defn say-hello [person]
  (str "Hello, " person "!"))

;; anonymous
(fn [x]
  (+ (* 2 x) (/ 3 x)))

((fn [x]
  (+ (* 2 x) (/ 3 x))) 3)

;; same as...
#(+ (* 2 %) (/ 3 %))

(#(+ (* 2 %) (/ 3 %)) 3)

;; calling functions

(say-hello "Matt")

;; variables
;; global scope

(def gravity 9.81)

(* 10 gravity)

;; function scope
(defn circ [r]
  (let [pi 3.14]
    (* 2 pi r)))

(circ 5)

;; basic conditional

(defn is-lenny [x]
  (if (= "Lenny" x) true false))

(is-lenny "Lenny")
(is-lenny "Bruce")

;; Data Structures
;; vectors

(def fibonacci [0 1 1 2 3 4 5 8 13 21])

;; hash maps
(def shopping {:milk 1.80 :bread 0.99 :cheese 3.50 :wine 6.75})

;; loop/recur
(defn times-two [items]
  (loop [xs items result []]
    (if (empty? xs) result
      (recur (rest xs) (conj result (* 2 (first xs)))))))

(times-two fibonacci)

;; map function
(map #(* 2 %) fibonacci)

;; reduce function
(reduce + [1 2 3 4 5])
(reduce + (vals shopping))

;; filter function
(filter odd? fibonacci)
(filter #(< 2 %) (vals shopping))

;; macros
;; macros have control over evaluation of their arguments
(defmacro postfix [expression]
  (conj (butlast expression) (last expression)))
