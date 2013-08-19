/*
 * https://code.google.com/codejam/contest/351101/dashboard#s=p1
 */
package com.fayi.scripts

trait Solution {
  def solve(data: List[String]) =
    data.map(l => data.indexWhere(_==l)+1 -> l).map(t => "Case #"+t._1+": "+t._2) foreach println
}

object ReverseWords extends App with Solution {
  // val in = io.Source.fromURL(getClass.getResource("/reversewords.in"))
  val in = io.Source.fromURL(getClass.getResource("/reversewords_test.in"))
  val data = in.getLines.drop(1).map(_.split("\\W").toList.reverse.mkString(" ")).toList
  solve(data)
}
