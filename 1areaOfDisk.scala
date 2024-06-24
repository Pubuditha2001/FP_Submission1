object Main {
  def main(args: Array[String]): Unit = {
    def Area(): Unit = {
        val r = 5
        val result = r*r*math.Pi
        println(f"The area of the disk is $result%.2f")
    }
    Area()
  }
}