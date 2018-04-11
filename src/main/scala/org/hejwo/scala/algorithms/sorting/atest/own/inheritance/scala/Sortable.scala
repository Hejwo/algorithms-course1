package org.hejwo.scala.algorithms.sorting.atest.own.inheritance.scala

// A <: B must be a subtype of B
trait Sortable[A <: Ordered[A]] extends Iterable[A] {
  def sort: Seq[A] = this.toList.sorted
}
