/*
 * @author Fayimora
 * @description 3n + 1 game
 */
object ThreeN extends App
{
  def sequence(num: Int) = {
    def recurthreeN(xs: Seq[Int], n: Int): Seq[Int] = n match {
      case 1 => xs :+ 1; xs
      case x if n%2==0 => recurthreeN( xs :+ n/2, n/2)
      case _ =>
        val t = 3*n + 1
        recurthreeN(xs :+ t, t)
    }
    recurthreeN(Seq(num), num)
  }
  def threeN(num: Int) = sequence(num).length

  // Tests for fun
  val ten = sequence(10)
  val eleven = sequence(11)
  val twentyTwo = sequence(22)

  // Show the content of the collection
  println(ten mkString ", ")
  println(eleven mkString ", ")
  println(twentyTwo mkString ", ")

  // Use threeN
  println(threeN(10))
  println(threeN(11))
  println(threeN(22))
}
