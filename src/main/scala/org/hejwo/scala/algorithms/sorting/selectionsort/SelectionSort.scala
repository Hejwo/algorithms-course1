package org.hejwo.scala.algorithms.sorting.selectionsort

object SelectionSort {

  def sort(unsorted: List[Int]): List[Int] = {
    if (isEmpty(unsorted)) unsorted else {
      val min = unsorted.min
      min :: sort(remove(min, unsorted))
    }
  }

  def remove(element: Int, list: List[Int]): List[Int] = list diff List(element)

  private def isEmpty(list: List[Int]) = {
    Option(list).getOrElse(List()).isEmpty
  }

}