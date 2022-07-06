fun main() {
    val a = readln().toLong()
    val b = readln().toLong()

    var result = 1L

    for (i in a until b) {
        result *= i
    }

    println(result)
}