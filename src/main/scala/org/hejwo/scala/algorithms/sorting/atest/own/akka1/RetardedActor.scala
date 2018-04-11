package org.hejwo.scala.algorithms.sorting.atest.own.akka1

import akka.actor.Actor

class RetardedActor extends Actor {
  override def receive = {
    case "hello" => doMeSon
  }

  private def doMeSon {
    sender() ! "goodbye"
    println("goodbye from RetardedActor")
  }
}
