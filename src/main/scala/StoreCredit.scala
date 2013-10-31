object StoreCredit extends App {
  val testCases = readInt
  (1 to testCases).foreach{ tc =>
    val (c, i) = (readInt, readInt)
    val prices = readLine.split(" +").map(_.toInt).toSeq
    val res = solve(c, i, prices)
    assert(res._1 > 0 && res._2 > 0, "Sanity check") // sanity check
    println("#Case %d: %d %d".format(tc, res._1, res._2))
  }

  def solve(c: Int, numOfItems: Int, prices: Seq[Int]): (Int, Int) = {
    val tup = prices.zipWithIndex
    val out = for{
      (pi, i) <- tup
      (pj, j) <- tup if (i != j && pi + pj == c)
    } yield (i+1, j+1)
    out.headOption.getOrElse((-1,-1))
  }
}
