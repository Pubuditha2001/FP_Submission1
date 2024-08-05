object FilterEven{

    def filterEvenNumbers(numbers: List[Int]):Unit={
        val output = numbers.filter(x=> x%2 == 0)
        println(s"Even numbers in the list = $output")
    }

    def main(arg: Array[String]):Unit={
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        filterEvenNumbers(input)
    }
}