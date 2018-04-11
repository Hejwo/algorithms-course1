package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.scala

trait Animal {
  def move {
    println("Animal moves !")
  }
}

trait Bird {
  def move {
    println("I'm a bird. I'm flying !!!")
  }
}

trait Pingun {
  def move {
    println("I'm a pinguin. I'm walking.")
  }
}

class Johnny extends Animal with Pingun with Bird {
  override def move = super.move
}


object Linierlization {
  def main(args: Array[String]): Unit = {
    val johnny: Pingun = new Johnny
    johnny.move
  }
}