object FilterPrime{

    def isPrime(n: Int): Boolean = {
        if (n <= 1) false
        else if (n <= 3) true
        else if (n % 2 == 0 || n % 3 == 0) false
        else {
            var i = 5
            while (i * i <= n) {
                if (n % i == 0 || n % (i + 2) == 0) return false
                i += 6
            }
            true
        }
    }

    def main(arg: Array[String]):Unit={
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val output = input.filter(isPrime)
        println(s"prime numbers in the list = $output")
    }
}