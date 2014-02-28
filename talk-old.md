
class: center, middle, inverse
layout: true

---

# Getting functional with Clojurescript
A Lisp for the browser

![Default-aligned-image](img/Clojure-Logo.png)

---
layout: false
# Matt Thompson

- EngD student at Bath/Sysemia ltd
- Researching procedural narratives in games
- Love tinkering with odd languages

---

class: center, middle, inverse

# What is it, and why should I care?

---

# Clojurescript: what is it?

- Compiles to Javascript
- Dialect of Lisp (Clojure)
- Can use JS libraries
- Uses Google's closure (not Clojure) compiler

---
class: center, middle, inverse

# What's Clojure, then?

---
# Clojure

- It's a dialect of Lisp
- It runs on the JVM (Java Virtual Machine)
- Can use Java libraries
- Encourages *immutable* data structures
- This makes it ideal for concurrency
- Very simple syntax

---
class: inverse
# Clojure example

    (defn my-function [x y]
        (let [xs (* x x) ys (* y y)]
            (Math/sqrt (+ xs ys))))

---

class: inverse
# Clojure example

    (defn my-function [x y]
        (let [xs (* x x) ys (* y y)]
            (Math/sqrt (+ xs ys))))

    var my-function = function(x, y) {
        var xs = x * x;
        var ys = y * y;
        return sqrt(xs + ys);
    }

---
class: center, middle, inverse

# It's a tree!
![Default-aligned-image](img/tree-dark.png)

---
class: center, middle, inverse

# OK, so what's Lisp?

---

# Lisp

- One of the oldest programming languages
- Designed in 1958 (!) by John McCarthy
- Multi-paradigm (esp. functional programming)
- Encourages meta-programming
- Most popular dialects: Common Lisp, Scheme
- ...and now Clojure!

---
class: inverse
## Lots of Irritating, Silly Parentheses
    ;; unreadable
    (defn dot-product [xs ys] (loop [acc 0.0, xr
    xs, yr ys] (if (or (empty? xr) (empty? yr)) acc
    (recur (+ acc (* (first xr) (first yr))) (rest
    xr) (rest yr)))))


---
class: inverse
## Lots of Irritating, Silly Parentheses
    ;; much better
    (defn dot-product [xs ys]
        (loop [acc 0.0, xr xs, yr ys]
           (if (or (empty? xr) (empty? yr))
              acc
              (recur (+ acc (* (first xr) (first yr)))
                     (rest xr)
                     (rest yr)))))

---

class: center, middle, inverse

# Relevant XKCD

![Default-aligned-image](img/lisp_cycles.png)

---
class: center, middle, inverse

# Right. So what's functional programming?

---

# Functional programming

- Treats computation as the evaluation of mathematical functions
- Avoids state and mutable data
- Emphasis on functions that don't have side effects
- Makes it easy to understand and predict the behaviour of a programme
- Javascript has some FP elements!

---

class: center, middle, inverse

# Syntax time!

---
class: center, middle, inverse

# What macros do
![Default-aligned-image](img/macro.png)

---

# Light Table

- A new editor written in Clojurescript
- Inspired by a talk called "[Inventing on Principle](vimeo.com/36579366)" by Bret Victor
- Built for "live coding"
- In very early alpha
- Also supports JS, Python (right now), but is designed for Clojure(script)
- Supports source maps!

---
class: center, middle, inverse

# What is "live coding"?

---
class: center, middle, inverse

# But how do you make a game with no state?

---

# How to make games in Clojurescript

- data immutability is encouraged
- so state is a problem, right?
- component-entity-system design

---

# Component-entity-system

- most games have an object oriented design
- can't really do that without state
- CES represents the whole game as a data structure

---
class: center, middle, inverse

# So, why would I use it?

---

# CLJS for web dev

- Clojure can be concurrent (thanks to JVM)
- CLJS can't (Javascript), but still has advantages
- can use Clojure server-side, CLJS client-side
- great instant feedback workflow
- still all a bit experimental, though

---

# CLJS and React

- Facebook made this library called React
- client-side with React and Om: DOM is a canvas (check the terminology here)
- Om is hella fast due to immutability

---

# So, why use Clojurescript?

- Expand your knowledge
- Functional is the future
- Great community
- Great tools
- Rich Hickey

---
class: inverse

# Learning resources

- Clojure for the Brave and True: [braveclojure.com]()
- Light Table CLJS tutorial: [github.com/swannodette/lt-cljs-tutorial]()
- Modern CLJS: [github.com/magomimmo/modern-cljs]()‎

---
class: center, middle, inverse

# Questions

Slides online at [cblop.github.io/clojurescript-talk]()

