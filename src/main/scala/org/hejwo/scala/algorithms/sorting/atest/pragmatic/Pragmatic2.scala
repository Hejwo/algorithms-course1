package org.hejwo.scala.algorithms.sorting.atest.pragmatic

object Pragmatic2 {

  def main(args: Array[String]): Unit = {
    val temperatures = List(20.2, 21.3, 25.6, 27.8, 32.1, 10.0)

    val max = temperatures.foldRight(Double.MinValue)((a, b) => {
      println(s"($a,$b)")
      Math.max(a, b)
    })
    val min = temperatures.foldLeft(Double.MinValue)(Math.min)
    println(s"Max summer temp is $max")
    println(s"Min summer temp is $min")
  }

}
