package org.hejwo.scala.algorithms.sorting.atest.own.dsl

import org.hejwo.scala.algorithms.sorting.atest.own.dsl.FarmersWorld.Apple.{Apple, Green, Old, Red}

object FarmersWorld {

  type Apples = List[Apple]
  type AppleCategory = Apple => Boolean

  def main(args: Array[String]): Unit = {
    val notOldApples: AppleCategory = apple => apple != Old

    val apples: Apples = List(Red, Red, Red, Green, Old, Old)
    apples filter notOldApples foreach println


  }

  object Apple extends Enumeration {
    type Apple = Value
    val Red, Green, Old = Value
  }

}
