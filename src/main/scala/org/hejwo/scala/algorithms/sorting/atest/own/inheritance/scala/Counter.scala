package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.scala

trait Counter {
  protected var count: Int

  def increment()
}

class IncByOne extends Counter {
  override protected var count: Int = 0

  override def increment(): Unit = count += 1
}
