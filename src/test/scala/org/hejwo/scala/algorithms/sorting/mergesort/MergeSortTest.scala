package org.hejwo.scala.algorithms.sorting.mergesort

import org.scalatest.{FlatSpec, Matchers}

class MergeSortTest extends FlatSpec with Matchers {

  "sort" should "return empty when empty" in {
    val list = List()
    val sorted = MergeSort.sort(list)

    sorted shouldBe empty
  }

  "sort" should "return single element when single element" in {
    val list = List(1)
    val sorted = MergeSort.sort(list)

    sorted should have size 1
  }

  "sort" should "sort simple list" in {
    val list = List(2, 1)
    val sorted = MergeSort.sort(list)

    sorted shouldBe List(1, 2)
  }

  "sort" should "sort with duplicates" in {
    val unsorted = List(3, 1, 4, 2, 4, 5)
    val sorted = MergeSort.sort(unsorted)

    sorted shouldBe List(1, 2, 3, 4, 4, 5)
  }

  "merge" should "join for right array smaller and equal size" in {
    val list1 = List(4, 5, 6)
    val list2 = List(1, 2, 3)

    val merged = MergeSort.merge(list1, list2)

    merged shouldBe List(1, 2, 3, 4, 5, 6)
  }

  "merge" should "join for right array smaller" in {
    val list1 = List(4, 5, 6, 7)
    val list2 = List(1, 2)

    val merged = MergeSort.merge(list1, list2)

    merged shouldBe List(1, 2, 4, 5, 6, 7)
  }

  "mergeRec" should "join for right array smaller and equal size" in {
    val list1 = List(4, 5, 6)
    val list2 = List(1, 2, 3)

    val merged = MergeSort.mergeRec(list1, list2)

    merged shouldBe List(1, 2, 3, 4, 5, 6)
  }

  "mergeRec" should "join for right array smaller" in {
    val list1 = List(4, 5, 6, 7)
    val list2 = List(1, 2)

    val merged = MergeSort.mergeRec(list1, list2)

    merged shouldBe List(1, 2, 4, 5, 6, 7)
  }

}
