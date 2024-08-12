object CaesarCipher{

    def encription(letter: Char, shift: Int):Char={
        if(letter.isLetter){
            val initial = 'a'.toInt
            val letter_ASCII = letter.toInt
            val output = ((letter_ASCII - initial + shift)%26 + 26)%26 + initial
            output.toChar
        }
        else
            letter
    }

    def decription(letter2: Char, shift2: Int):Char={
        if(letter2.isLetter){
            val initial = 'a'.toInt
            val letter_ASCII = letter2.toInt
            val output = ((letter_ASCII - initial - shift2)%26 + 26)%26 + initial
            output.toChar
        }
        else
            letter2
    
    }

    def Cipher():Unit={
        println("Enter the message to encript")
        val input = scala.io.StdIn.readLine()
        val input_string = input.toLowerCase
        println("Enter the the No.of Shifts")
        val shift = scala.io.StdIn.readLine().toInt
        val encripted_message = input_string.map(letter => encription(letter, shift))
        println(s"Encripted message : $encripted_message")

        println("Enter the message to decript")
        val input2 = scala.io.StdIn.readLine()
        val input_string2 = input2.toLowerCase
        println("Enter the the No.of Shifts done in the Encription")
        val shift2 = scala.io.StdIn.readLine().toInt
        val decripted_message = input_string2.map(letter2 => decription(letter2, shift2))
        println(s"$decripted_message")
    }

    def main(args: Array[String]):Unit={
        Cipher()
    }
}