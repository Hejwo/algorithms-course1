package odersky

import scala.annotation.tailrec

object Factorial {

  // non tail recursive version. We are multiplying in last functions operation, not just call another function
  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n-1)
  }

  @tailrec
  def factorialTailRec(n: Int, acc: Int = 1): Int = {
    if (n == 0) acc else factorialTailRec(n-1, acc * n)
  }


}
