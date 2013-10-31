package uva

/**
 * Author: Fayimora Femi-Balogun (fayi@fayimora.com)
 * Date: 30/10/2013
 * Time: 09:06
 */
import collection.mutable.IndexedSeq

object UVA499 extends App {
  val input = io.Source.stdin.getLines
  for(line <- input; l = line.trim; if l != "" ) {
    val freqs: IndexedSeq[Int] = IndexedSeq.fill(54)(0)

    (0 until l.length).foreach{ i =>
      val c: Char = l.charAt(i)
      if(c > 64 && c < 91) freqs(c-65) += 1
      else if(c > 96 && c < 123)  freqs(26+(c-97)) += 1
    }

    val max = freqs.max
    val res = new StringBuilder

    for (i <- (0 to 25); if(max == freqs(i)) ) res += (i+65).toChar
    for (i <- (26 to 52); if(max == freqs(i)) ) res += (i+71).toChar

    println(s"$res $max")
  }
}

/*val seq = l.filter(_.isLetter).groupBy(identity).map(m => (m._1, m._2.size)).toSeq.sortBy(_._2).reverse
   val res = seq.takeWhile(_._2 == seq(0)._2).sortBy(_._1).map(_._1).mkString + " " + seq(0)._2
   println(s"$res")*/

/*val ls: Seq[(Char, Int)] = l.filter(_.isLetter).groupBy(identity).toSeq.map(t => (t._1, t._2.length))
val max: Int = ls.maxBy(_._2)._2
val takeWhile: Seq[(Char, Int)] = ls.takeWhile (t => t._2 == max)
println(takeWhile)
val res = takeWhile.foldLeft("")(_ + _._1)
println(s"$res $max")*/