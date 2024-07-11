object PatternMatching{
    def main(args: Array[String]): Unit = {
        println("Enter an Integer :")
        val x = scala.io.StdIn.readLine().toInt
        checkSign(x)

    }

    def checkSign(x:Int): Unit = x<=0 match{
        case true => println("Negative/Zero")
        case false => x%2==0 match{
            case true => println("Even number")
            case false => println("Odd number")
    }
        
    }
}
