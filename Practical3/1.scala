import scala.io.StdIn.readLine
object Reverser{
    def main(args: Array[String]):Unit = {
    println("Enter the string:")
    val original_string = readLine();
    val reversed_string = reverseString(original_string)
    println(s"Original String: $original_string")
    println(s"Reversed String: $reversed_string")
}
}

def reverseString(input: String): String ={
        if(input.isEmpty) ""
        else reverseString(input.tail) + input.head
    }