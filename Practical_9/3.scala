object NameFormatter {

    def to_upper(name: String): String = name.toUpperCase
    def to_lower(name: String): String = name.toLowerCase

    def formatNames(name: String, formatter: String => String): String = formatter(name)

    def main(args: Array[String]): Unit = {
        val names = List("Benny", "Niroshan", "Saman", "Kumara")

        val upper_formatter: String => String = to_upper
        val lower_formatter: String => String = to_lower
        val mixed_formatter: String => String = (name: String) => {
          if (name.length % 2 == 0) name.toUpperCase else name.toLowerCase
        }

        println(formatNames(names(0), upper_formatter))
        println(formatNames(names(1), mixed_formatter))
        println(formatNames(names(2), lower_formatter))
        println(formatNames(names(3), (name: String) => name.capitalize))
  }
}
