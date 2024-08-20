object NumberClassifier {
  def main(args: Array[String]): Unit = {
    val classify_number: Int => Unit = (number: Int) => {
      number match {
        case n if n <= 0 => println("Negative/Zero is input")
        case n if n % 2 == 0 => println("Even number is given")
        case _ => println("Odd number is given")
      }
    }

    println("Enter an integer: ")
    val input =scala.io.StdIn.readInt()
    classify_number(input)
  }
}
