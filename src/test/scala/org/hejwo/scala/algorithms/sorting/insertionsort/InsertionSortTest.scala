package org.hejwo.scala.algorithms.sorting.insertionsort

import org.scalatest.FlatSpec

class InsertionSortTest extends FlatSpec {

  import InsertionSort._

  "empty list" should "return empty list" in {
    val unsorted = List()
    val sorted = sort(unsorted)

    assert(sorted.size === 0)
    assert(sorted === unsorted)
  }

  "null list" should "return null list" in {
    val unsorted = null
    val sorted = sort(unsorted)

    assert(sorted === null)
  }

  "unsorted list without duplicates" should "be sorted" in {
    val unsorted = List(3, 1, 2, 4, 5)
    val sorted = sort(unsorted)

    assert(sorted === List(1, 2, 3, 4, 5))
  }

  "unsorted with duplicates" should "be sorted" in {
    val unsorted = List(3, 1, 4, 2, 4, 5)
    val sorted = sort(unsorted)

    assert(sorted === List(1, 2, 3, 4, 4, 5))
  }

  "sorted list without duplicates" should "return sorted" in {
    val unsorted = List(1, 2, 3, 4, 5)
    val sorted = sort(unsorted)

    assert(sorted === List(1, 2, 3, 4, 5))
  }

  "insertSorted" should "return 1 element list when empty list" in {
    val existingList = List()
    val result = insertSorted(1, existingList)

    assert(result === List(1))
  }

  "insertSorted" should "return 1 element list when null list" in {
    val existingList = null
    val result = insertSorted(1, existingList)

    assert(result === List(1))
  }

  "insertSorted" should "add to beginning when inserting the smallest number" in {
    val existingList = List(2, 3, 4, 5)
    val result = insertSorted(1, existingList)

    assert(result === List(1, 2, 3, 4, 5))
  }

  "insertSorted" should "add to end when biggest number" in {
    val existingList = List(1, 2, 3, 4, 5)
    val result = insertSorted(6, existingList)

    assert(result === List(1, 2, 3, 4, 5, 6))
  }

  "insertSorted" should "add in the middle when middle number" in {
    val existingList = List(1, 2, 3, 5, 6)
    val result = insertSorted(4, existingList)

    assert(result === List(1, 2, 3, 4, 5, 6))
  }

}
