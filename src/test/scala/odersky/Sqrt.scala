package odersky

import java.lang.Math.abs

object Sqrt {

  def sqrt(x: Double) = {
    def goodEnough(guess: Double): Boolean = abs(guess * guess - x) / x < 0.001
    def improve(guess: Double): Double = (guess + x / guess) / 2
    def sqrtIter(guess: Double = 1.0): Double = if (goodEnough(guess)) guess else sqrtIter(improve(guess))
    sqrtIter(x)
  }

  def main(args: Array[String]): Unit = {
    println(sqrt(4))
  }

}
