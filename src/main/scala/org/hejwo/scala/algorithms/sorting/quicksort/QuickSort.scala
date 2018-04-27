package org.hejwo.scala.algorithms.sorting.quicksort

import scala.math.random

object QuickSort {

  def sort(unsorted: List[Int]): List[Int] = {
    if (unsorted.size <= 1 || unsorted == null) unsorted else {
      val randomIndex = (random() * unsorted.size).toInt
      // val pivot = unsorted.head // O(n^2)
      val pivot = unsorted(randomIndex) // O(n log n)
      val (left, right) = splitAgainstPivot(unsorted, pivot)
      sort(left) ::: sort(right)
    }
  }

  private def splitAgainstPivot(unsorted: List[Int], pivot: Int) = {
    val (left, right) = unsorted.partition(pivot >)
    (left.reverse, right.reverse)
  }

}
