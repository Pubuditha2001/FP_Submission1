object StringFormattingDemo {

  def toUpper(input: String): String = {
    input.toUpperCase()
  }

  def toLower(input: String): String = {
    input.toLowerCase()
  }

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val formattedBenny = formatNames("Benny")(toUpper)
    println(formattedBenny)  

    val formattedNiroshan = "Niroshan".substring(0, 2).toUpperCase + "Niroshan".substring(2)
    println(formattedNiroshan) 

    val formattedSaman = formatNames("Saman")(toLower)
    println(formattedSaman)

    val formattedKumara = "Kumara".substring(0, 1).toUpperCase + "Kumara".substring(1, 5).toLowerCase + "Kumara".substring(5).toUpperCase
    println(formattedKumara) 
  }
}
