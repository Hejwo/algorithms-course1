package org.hejwo.scala.algorithms.sorting.quicksort

import org.scalatest.{FlatSpec, FunSuite, Matchers}

class QuickSortTest extends FlatSpec with Matchers {

  "sort" should "handle simple case" in {
        val unsorted = List(16, 2, 1, 3, 4, 5, 21, 11, 14, 12, 13, 7, 0, 9, 8, 15, 6, 10)

    val sorted = QuickSort.sort(unsorted)

    sorted shouldBe List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 21)
  }

}
