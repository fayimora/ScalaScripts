object Fibonacci extends App{
  def fib(n: Int) = {
    def fibRec(n: Int, nxt: Int, acc: Int): Int = n match{
      case 0 => acc
      case _ => fibRec(n-1, acc+nxt, nxt)
    }
    fibRec(n, 1, 0)
  }
  println("Fib 6 = " + fib(6)) // => 8
}
