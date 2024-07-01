def calculateMean(n1:Int, n2:Int): Double ={
    val avg = (n1+n2).toDouble / 2
    avg
}

object ArithmeticMean{
    def main(args: Array[String]):Unit = {
        val n1 = 12
        val n2 = 15
        val result = calculateMean(n1, n2)
        println(f"The arithmetic avg of $n1 and $n2 is $result%.2f")
    }
}