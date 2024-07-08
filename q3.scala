object StringPattern {
  def toUpper(word: String): String = {
    word.toUpperCase
  }

  def toLower(word: String): String = {
    word.toLowerCase
  }

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    println(formatNames("Benny")(toUpper))
    println(formatNames("Niroshan")(toLower))
    println(formatNames("Saman")(toUpper))
    println(formatNames("Kumara")(toLower))
  }
}