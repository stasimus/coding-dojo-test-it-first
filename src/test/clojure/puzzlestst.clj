(ns puzzlestst
  (:require puzzles)
  (:use clojure.test))

(deftest test-sorting
  (is (= '((1) (1 2) (1 2 3)) (puzzles/sortListOfLists '((1 2 3) (1 2) (1))))))

(deftest test-sorting-2
  (is (= '((1) (1) (1 2) (1 2 3 4)) (puzzles/sortListOfLists '((1) (1 2 3 4) (1 2) (1))))))