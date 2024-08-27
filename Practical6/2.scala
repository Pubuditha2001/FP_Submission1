import scala.io.StdIn

object Pactical_6_Problem_2 {
    
def getStudentInfo(): (String, Int, Int, Double, Char) = {
    val name = readLine("Enter the Name: ")
    if (name.isEmpty) {
        println("Can't enter without a name")
        ("", 0, 0, 0.0, ' ') 
    } else {
        print("Enter the Mark: ")
        val mark = readInt()
        if (mark < 0) {
            println("Can't add negative marks")
            ("", 0, 0, 0.0, ' ') 
        } else {
            val totalMarks = 100 
            val percentage = (mark.toDouble / totalMarks) * 100
            val grade = if (mark >= 90) {
                'A'
            } else if (mark >= 75) {
                'B'
            } else if (mark >= 50) {
                'C'
            } else {
                'D'
            }

            (name, mark, totalMarks, percentage, grade)
        }
    }
}


    def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
        val (name, marks, totalMarks, percentage, grade) = student
        println(s"Name: $name")
        println(s"Marks: $marks")
        println(s"Total Marks: $totalMarks")
        println(s"Percentage: $percentage")
        println(s"Grade: $grade")
}
    
    
    def main(args: Array[String]) ={
        val student = getStudentInfo();
        printStudentRecord(student);



    }
}
