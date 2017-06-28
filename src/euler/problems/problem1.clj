(ns euler.problems.problem1)

;;Multiples of 3 and 5
;;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
;;The sum of these multiples is 23.
;;Find the sum of all the multiples of 3 or 5 below 1000.

(defn a-progression-sum
  "Calculate arithmetic progression"
  [n a1 d]
  (* (/ n 2) (+ (* 2 a1) (* (- n 1) d))))

(defn n-of-a-progression-uppon
  [border a1 d]
  (+ (quot (- border a1 1) d) 1))

(defn sum-of-a-progression-uppon
  [border a1 d]
  (a-progression-sum (n-of-a-progression-uppon border a1 d)
                     a1
                     d))

(println (let [sum-3-3 (sum-of-a-progression-uppon 1000 3 3)
               sum-5-5 (sum-of-a-progression-uppon 1000 5 5)
               sum-of-confluence (sum-of-a-progression-uppon 1000 0 15)]
               (- (+ sum-3-3 sum-5-5) sum-of-confluence)))
