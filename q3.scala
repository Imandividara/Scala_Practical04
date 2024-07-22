object StringFormatter {

  
  def toUpper(input: String): String = input.toUpperCase


  def toLower(input: String): String = input.toLowerCase

  // to format a name using a given function
  def formatNames(name: String)(formatter: String => String): String = formatter(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    
    val formattedNames = names.zipWithIndex.map {
      case (name, index) => index match {
        case 0 => formatNames(name)(toUpper)      // BENNY
        case 1 => formatNames(name.take(2))(toUpper) + formatNames(name.drop(2))(toLower) // NIroshan
        case 2 => formatNames(name)(toLower)      // saman
        case 3 => formatNames(name.dropRight(1))(toLower) + formatNames(name.takeRight(1))(toUpper) // KumarA
      }
    }

  
    formattedNames.foreach(println)
  }
}
