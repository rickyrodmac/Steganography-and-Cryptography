const val DIVISOR = 4

fun main() {
    val elementsInSequence = readln().toInt()

    var max = 0

    for (loopIndex in 1..elementsInSequence) {
        val input = readln().toInt()
        if (input % DIVISOR == 0 && input > max) max = input
    }
    println(max)
}