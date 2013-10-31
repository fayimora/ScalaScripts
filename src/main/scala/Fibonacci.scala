object Fibonacci extends App{
  import scala.collection.mutable.Map
  var cache = Map(0->0, 1->1, 2->1, 3->2, 4->3, 5->5, 6->8)
  def fib(n: Int): Int ={
    if(cache.get(n).isEmpty) {
      val res = fib(n-1) + fib(n-2)
      cache + (n -> res)
      res
    } else cache(n)
  }

  val fibs:Stream[Int] = 0 #:: 1 #:: (fibs zip fibs.tail).map{ t => t._1 + t._2 }

  (0 to 1000000).foreach( i => println(s"Fib $i = " + fib(i)) )
  // def fib(n: Int, nxt: Int=1, acc: Int=0): Int = n match {
  //   case 0 => acc
  //   case _ => fib(n-1, acc+nxt, nxt)
  // }
}
