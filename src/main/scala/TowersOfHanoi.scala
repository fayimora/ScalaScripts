object TowersOfHanoi extends App {
  // move(8, 1, 3, 2)
  move(3)
  def move(n: Int, from: Int=1, to: Int=3, via: Int=2) : Unit = {
    if (n == 0) println("Nothing to move!")
    else if (n == 1) println(s"Move disk from pole $from to pole $to")
    else {
      move(n - 1, from, via, to)
      move(1, from, to, via)
      move(n - 1, via, to, from)
    }
  }
}
