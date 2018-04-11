package org.hejwo.scala.algorithms.sorting.atest.own.exceptions

import java.io.{BufferedReader, InputStreamReader}
import java.net.URL

object ExceptionHandler {

  def main(args: Array[String]): Unit = {
    try {
      val url = new URL("http://www.wp2222.pl")
      val reader = new BufferedReader(new InputStreamReader(url.openStream))
      var line = reader.readLine
      for (_ <- 0 to 10 if line != null) {
        println(line)
        line = reader.readLine
      }
    } catch {
      case e: Throwable => println(e)
    }


  }

}
