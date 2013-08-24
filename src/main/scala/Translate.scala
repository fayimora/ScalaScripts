object Translate extends App {
  val goog = "ejp mysljylc kd kxveddknmc re jsicpdrysi " +
  "rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd " +
  "de kr kd eoya kw aej tysr re ujdr lkgc jv " + "zq"

  val english = "our language is impossible to understand " +
  "there are twenty six factorial possibilities " +
  "so it is okay if you want to just give up " + "qz"

  val lines = io.Source.fromURL(getClass.getResource("translate.in")).getLines.drop(1).toList
  val toMap = goog.zip(english).toMap
  val decode = (x: Char) => toMap(x)

  val result = lines.map(l => lines.indexWhere(_ == l)+1 -> l).filter(t => t._2.size<=100)
    .map(t=>"Case #" + t._1 + ": " + t._2.map(decode))
    result.foreach(println)
}
