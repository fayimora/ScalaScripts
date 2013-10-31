/*
 * https://code.google.com/codejam/contest/351101/dashboard#s=p1
 */
object ReverseWords extends App {
  val in = io.Source.fromURL(getClass.getResource("/reversewords_test.in"))
  val data = in.getLines.drop(1).map(_.split("\\W").toList.reverse.mkString(" ")).toList
  data.map(l => data.indexWhere(_==l)+1 -> l).map(t => "Case #"+t._1+": "+t._2) foreach println
}
