package org.hejwo.scala.algorithms.sorting.atest.pragmatic

import scala.util.Random

object Pragmatic1 {

  def main(args: Array[String]): Unit = {
    val symbols = List("AAPL", "AMZN")
    val year = 2015

    val (topStock, topPrice) = symbols
      .map(s => (s, getYearEndClosingPrice(s, year)))
      .maxBy(_._2)

    println(s"Top stock of yer $year is $topStock with closing price $$$topPrice")
  }

  def getYearEndClosingPrice(symbol: String, year: Int): Double = {
    Random.nextDouble() * 50
  }

}
