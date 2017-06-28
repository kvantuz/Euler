(ns euler.problems.problem2)

(defn fibonacci-generate-next-num-before-even
  [prev-even num-before-prev-even]
  (+ prev-even prev-even num-before-prev-even))

(defn fibonacci-generate-even-collection-uppon
  [border]
  (loop [prev-even 2
         num-before-prev-even 1
         resulting-collection '()]
    (if (> prev-even border)
      resulting-collection
      (let [num-before-new-even (fibonacci-generate-next-num-before-even prev-even
                                                                         num-before-prev-even)
            new-even (+ num-before-new-even
                        prev-even
                        num-before-prev-even)]
        (recur new-even
               num-before-new-even
               (conj resulting-collection prev-even))
      ))))

(println (apply + (fibonacci-generate-even-collection-uppon 4000000)))
