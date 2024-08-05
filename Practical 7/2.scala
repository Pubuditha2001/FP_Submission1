object CalculateSquare{

    def calculateSquare(numbers: List[Int]):Unit={
        val output = numbers.map(x => x*x)
        println(s"Square of input numbers = $output")
    }

    def main(arg: Array[String]):Unit={
        val input = List(1, 2, 3, 4, 5)
        calculateSquare(input)
    }
}