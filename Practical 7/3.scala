object FilterPrime{

    def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else if (n == 2) true
        else !(2 until n).exists(x => n%x == 0)
    }

    def main(arg: Array[String]):Unit={
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val output = input.filter(isPrime)
        println(s"prime numbers in the list = $output")
    }
}
