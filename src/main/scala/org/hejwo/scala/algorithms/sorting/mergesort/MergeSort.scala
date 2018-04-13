package org.hejwo.scala.algorithms.sorting.mergesort

object MergeSort {

  /**
    * This one is not used due to O(n ^^ 2) complexity
    */
  def mergeRec(left: List[Int], right: List[Int]): List[Int] = (left, right) match {
    case (left, Nil) => left
    case (Nil, right) => right
    case (leftHead::leftTail, rightHead::rightTail) if leftHead <= rightHead => leftHead::mergeRec(leftTail, right)
    case (leftHead::leftTail, rightHead::rightTail) if leftHead > rightHead => rightHead::mergeRec(left, rightTail)
  }

  def merge(left: List[Int], right: List[Int]) = {
    def getElementAt(list: List[Int], index: Int) = if (list.isDefinedAt(index)) Some(list(index)) else None
    def maxSize(left: List[Int], right: List[Int]): Int = if (left.size > right.size) left.size else right.size

    var merged = List[Int]()

    var (i, j) = (0, 0)
    while (i < left.size || j < right.size) {
      val leftElement = getElementAt(left, i)
      val rightElement = getElementAt(right, j)

      def insertLeft {
        merged = merged :+ leftElement.get; i = i + 1
      }

      def insertRight {
        merged = merged :+ rightElement.get; j = j + 1
      }

      if(leftElement.isDefined && rightElement.isDefined) {
        if(leftElement.get <= rightElement.get) insertLeft
        if(rightElement.get < leftElement.get) insertRight
      }

      if (leftElement.isDefined && rightElement.isEmpty) insertLeft
      if (rightElement.isDefined && leftElement.isEmpty) insertRight
    }

    merged
  }

  def sort(unsorted: List[Int]): List[Int] = {
    if (unsorted.isEmpty || unsorted.size == 1) {
      unsorted
    } else {
      val (left, right) = unsorted.splitAt(unsorted.size / 2)
      val leftSorted = sort(left)
      val rightSorted = sort(right)

      merge(leftSorted, rightSorted)
    }
  }

}
