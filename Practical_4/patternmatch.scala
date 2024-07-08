object PatternMatchingDemo {
  def main(args: Array[String]): Unit = {
    try {
      print("Please enter an integer: ")
      val input = scala.io.StdIn.readLine().toInt
      input match {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number is given")
        case _ => println("Odd number is given")
      }
    } catch {
      case _: NumberFormatException => println("Please provide a valid integer")
    }
  }
}
