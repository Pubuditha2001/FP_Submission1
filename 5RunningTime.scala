/*I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7
min per km) and 2 km at easy pace again to reach home. What is the
total running time?*/



object Time{
    def main(args: Array[String]): Unit={
        val easy_pace = 8
        val tempo = 7
        val distance1 = 2
        val distance2 = 3
        val distance3 = 2

        def pace1Time(): Double = {
            val time1 = easy_pace*distance1
            println(s"time 1 = $time1")
            time1
        }

        def pace2Time(): Double = {
            val time2 = tempo*distance2
            println(s"time 2 = $time2")
            time2
        }

        def pace3Time(): Double = {
            val time3 = easy_pace*distance3
            println(s"time 3 = $time3")
            time3
        }
        
        def totalTime(): Unit = {
            val result = pace1Time() + pace2Time() + pace3Time()
            println(f"Total time = $result%.1f")
        }

        totalTime()
    }
}
