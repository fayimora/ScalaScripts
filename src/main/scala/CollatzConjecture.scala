object CollatzConjecture {
  def main(args: Array[String]): Unit = {
    val lines = io.Source.stdin.getLines
    lines.foreach { line =>
      val a = line.split(" ").map(_.toInt)
      val longestCycle = longestCycleLength(a(0), a(1))
      println(s"$line $longestCycle")
    }
  }

  def longestCycleLength(start: Int, finish: Int): Int =
    (for(i <- start to finish) yield(i, cycleLength(i))).maxBy(_._2)._2

  def cycleLength(n: Int, count: Int=0): Int = n match {
    case 1 => count+1
    case x if x%2==0 => cycleLength(n/2, count+1)
    case _ =>
      val x = 3*n + 1
      cycleLength(x, count+1)
  }
}
