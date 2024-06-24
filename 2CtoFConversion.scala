/*The temperature is 35C; convert this temperature into Fahrenheit.
ºF =ºC * 1.8000 + 32.00 */

object CtoFConversion{
    def main(args :Array[String]): Unit = {
        def convert(): Unit={
            val c = 35
            var f = (c*1.8)+32
            println(f"$c%dC in Fahrenheit is $f%.2fF")
        }
        convert()
    }
}