package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.scala

import scala.collection.mutable

class CustomersBox extends Sortable[Customer] {
  private val customers = mutable.Set[Customer]()

  def this(list: Customer*) {
    this
    list.foreach(customers.add)
  }

  override def iterator = customers.iterator
}

object CustomersBox {

  def main(args: Array[String]): Unit = {
    val c1 = new Customer("zzz", "")
    val c2 = new Customer("aaa", "")
    val c3 = new Customer("ccc", "")
    val c4 = new Customer("bbb", "")

    val box = new CustomersBox(c1, c2, c3, c4)
    println(box.sort)
  }
}
