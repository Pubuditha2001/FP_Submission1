/*The volume of a sphere with radius r is 4/3 Pi r3. What is the
volume of a sphere with radius 5?*/

object volume{
    def main(args: Array[String]): Unit={
        def volume(): Unit = {
            val r = 5
            var volume = math.Pi *r*r*r*4/3
            println(f"Volume of the sphere is $volume%.2f")
        }
        volume()
    }
}
