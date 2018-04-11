package org.hejwo.scala.algorithms.sorting.atest.own.akka1


import akka.actor.{ActorSystem, Props}

object Runner {

  def main(args: Array[String]): Unit = {
    val system = ActorSystem("akka1-system")

    val helloActor = system.actorOf(Props[HelloActor], "helloActor1")
    val retardedActor = system.actorOf(Props[RetardedActor], "retardedActor1")

    helloActor ! "hello"

    system.terminate
  }

}
