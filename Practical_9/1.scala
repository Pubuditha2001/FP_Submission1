import scala.io.StdIn._

object InterestCalculator {
  def main(args: Array[String]): Unit = {
    val interestCalculator: Double => Double = (deposit: Double) => {
      deposit match {
        case d if d <= 20000 => d * 0.02
        case d if d <= 200000 => d * 0.04
        case d if d <= 2000000 => d * 0.035
        case d => d * 0.065
      }
    }

    println("Enter the deposit amount in Rs.: ")
    val deposit = readLine().toDouble

    val interest = interestCalculator(deposit)

    println(f"Deposit: Rs. $deposit%.2f => Interest: Rs. $interest%.2f")
  }
}
