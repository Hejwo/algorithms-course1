package org.hejwo.scala.algorithms.sorting.insertionsort

object InsertionSort {

  def sort(unsorted: List[Int]): List[Int] = {
    if (isEmpty(unsorted)) unsorted else {
      insertSorted(unsorted.head, unsorted.tail)
    }
  }

  def insertSorted(element: Int, list: List[Int]): List[Int] = {
    if (isEmpty(list)) element :: Nil else {
      val isBiggerThanElement: Int => Boolean = el => el >= element
      val (biggerElems, smallerElems) = list.partition(isBiggerThanElement)
      smallerElems ::: (element :: biggerElems)
    }
  }

  private def isEmpty(unsorted: List[Int]): Boolean = Option(unsorted).getOrElse(List()).isEmpty

}
