object fibonacciOutput{

    def main(args: Array[String]): Unit={
        val f =fibonacci(5)
        printf(s"$f")
    }
    
    def fibonacci(n: Int): List[Int] = {
        if (n <= 0) {
            Nil
        } else if (n == 1) {
            List(0)
        } else if (n == 2) {
            List(0, 1)
        } else {
            val prev = fibonacci(n - 1)
            val next = prev(n - 2) + prev(n - 3)
            prev :+ next
        }
    }
}

