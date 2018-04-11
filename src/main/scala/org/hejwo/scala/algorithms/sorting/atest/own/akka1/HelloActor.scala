package org.hejwo.scala.algorithms.sorting.atest.own.akka1

import akka.actor.Actor

class HelloActor extends Actor {
  override def receive = {
    case "hello" => println("hello from HelloActor !")
    case "goodbye" => println("goodbye from HelloActor !")
    case _ => println("huh?")
  }
}
