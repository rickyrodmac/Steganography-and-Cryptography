fun main() {
    val numberOfStudents = readln().toInt()
    val grades = arrayOf(0, 0, 0, 0, 0)

    for (loop in 1..numberOfStudents) {
        val input = readln().toInt()
        grades[input - 1]++
    }
    for (loop in 1 until grades.size) {
        print("${grades[loop]} ")
    }
}
