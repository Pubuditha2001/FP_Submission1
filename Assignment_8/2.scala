object NumberCategorization{
    def main(args:Array[String]):Unit={

        println("Enter the integer")
        val number = scala.io.StdIn.readLine().toInt

        val isMultipleOf3: Int => Boolean = _ % 3 == 0
        val isMultipleOf5: Int => Boolean = _ % 5 == 0

        val result = (isMultipleOf3(number), isMultipleOf5(number)) match {
            case (true, true) => "Multiple of Both Three and Five"
            case (true, false) => "Multiple of Three"
            case (false, true) => "Multiple of Five"
            case _ => "Not a Multiple of Three or Five"        
        }
        
        println(result)
    }
}