package org.hejwo.scala.algorithms.sorting

object ArrayRotation {

  def solution(a: Array[Int]): Int = {
    val sized = a.groupBy(nr => nr).map(p => (p._1, p._2.length)).filter(_._2 == 1)
    if (sized.isEmpty) -1 else sized.minBy(_._1)._1
  }

  def main(args: Array[String]): Unit = {
    val array = List[Int](9, 3, 9, 3, 9, 7, 9).toArray
    println(solution(array))
  }

}
