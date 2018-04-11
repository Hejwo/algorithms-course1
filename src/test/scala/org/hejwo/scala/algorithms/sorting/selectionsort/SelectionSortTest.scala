package org.hejwo.scala.algorithms.sorting.selectionsort

import org.scalatest.{FlatSpec, FunSpec, FunSuite}

class SelectionSortTest extends FunSuite {

  test("empty list should return empty list") {
    val unsorted = List()
    val sorted = SelectionSort.sort(unsorted)

    assert(sorted.size === 0)
    assert(sorted === unsorted)
  }

  test("null list should return null list") {
    val unsorted = null
    val sorted = SelectionSort.sort(unsorted)

    assert(sorted === null)
  }

}

class SelectionSortTest2 extends FlatSpec {

  import SelectionSort.sort

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

}

class SelectionSortTest3 extends FunSpec {

}
