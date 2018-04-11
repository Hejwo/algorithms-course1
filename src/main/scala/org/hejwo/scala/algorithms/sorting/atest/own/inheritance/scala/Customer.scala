package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.scala

class Customer(val name: String, val address: String) extends Ordered[Customer] {

  private final var basket: List[(String, Double)] = List()

  def add(name: String, price: Double) = {
    basket = (name, price) :: basket
  }

  def total: Double = basket.map(_._2).sum

  override def compare(that: Customer) = name.compareTo(that.name)

  override def toString = s"Customer($name)"
}

class DiscountedCustomer(name: String, address: String) extends Customer(name, address) {
  override def total = super.total * 0.90
}