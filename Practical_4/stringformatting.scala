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
    val n1 = formatNames("Benny")(toUpper)
    println(n1)  

    val n2 = "Niroshan".substring(0, 2).toUpperCase + "Niroshan".substring(2)
    println(n2) 

    val n3 = formatNames("Saman")(toLower)
    println(n3)

    val n4 = "Kumara".substring(0, 1).toUpperCase + "Kumara".substring(1, 5).toLowerCase + "Kumara".substring(5).toUpperCase
    println(n4) 
  }
}
