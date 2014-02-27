;; Modules
;; --------------------------

;; namespaces provide modularity
(ns cljs-demo)

;; prefix notation: functions on left, arguments on right

(+ 2 4 5)

;; Defining functions
;; --------------------------

;; last line is return value

(defn say-hello [greeting person]
  (str greeting " " person ", how's it going?"))

;; calling functions

(say-hello "Hey" "Matt")

;; anonymous
(fn [x]
  (+ (* 2 x) (/ 3 x)))

((fn [x]
  (+ (* 2 x) (/ 3 x))) 3)

;; same as...
#(+ (* 2 %) (/ 3 %))

(#(+ (* 2 %) (/ 3 %)) 3)


;; Variables
;; --------------------------

;; def: global scope

(def gravity 9.81)

(* 10 gravity)

;; let: function scope
(defn circ [r]
  (let [pi 3.14]
    (* 2 pi r)))

(circ 5)

;; Basic conditionals
;; --------------------------

(defn is-lenny [x]
  (if (= "Lenny" x) true false))

(is-lenny "Lenny")
(is-lenny "Bruce")


;; Data Structures
;; --------------------------
;; vectors

(def fibonacci [0 1 1 2 3 4 5 8 13 21])

(first fibonacci)
(rest fibonacci)
(nth fibonacci 4)

;; hash maps
(def shopping {:milk 1.80 :bread 0.99 :cheese 3.50 :wine 6.75})

(:cheese shopping)
(vals shopping)

;; Looping
;; --------------------------

;; loop/recur
(defn times-two [items]
  (loop [xs items result []]
    (if (empty? xs) result
      (recur (rest xs) (conj result (* 2 (first xs)))))))

(times-two fibonacci)

;; Functional Programming
;; --------------------------

;; map function
(map #(* 2 %) [1 2 3 4 5])
(map #(* 2 %) fibonacci)

(defn shout [word]
  (str (.toUpperCase word) "! "))

(map shout ["it's" "me" "mario"])

;; reduce function
(reduce + [1 2 3 4 5])
(reduce + fibonacci)
(reduce + (vals shopping))

;; filter function
(filter odd? fibonacci)
(filter #(< 2 %) (vals shopping))

;; Macros
;; --------------------------

;; macros have control over evaluation of their arguments
;; they implement symbolic manipulation magic
(defmacro postfix [expression]
  (conj (butlast expression) (last expression)))

(postfix (1 2 +))
