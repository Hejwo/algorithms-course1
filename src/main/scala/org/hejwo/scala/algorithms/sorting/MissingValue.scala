package org.hejwo.scala.algorithms.sorting

object MissingValue {

  def solution(a: Array[Int]): Int = {
    val sorted = a.sorted
    def recSol(list: List[Int], expected: Int): List[Int] = {
      if (list.isEmpty) Nil else {
        val head = list.head
        if (expected != head) expected :: recSol(list.tail, head + 1) else recSol(list.tail, head + 1)
      }
    }
    recSol(sorted.toList, sorted.headOption.getOrElse(-1)).headOption.getOrElse(-1)
  }

  def main(args: Array[String]): Unit = {
    val arr = Array[Int](2, 3, 1, 5)
    println(solution(arr))
  }

}
