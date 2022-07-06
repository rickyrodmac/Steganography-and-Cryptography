import kotlin.Int.Companion.MIN_VALUE

fun main() {
    val loopCount = readln().toInt()

    var stillSorted = true // Assume stored
    var previous = MIN_VALUE

    for (i in 1..loopCount) {
        val curent = readln().toInt()
        if (curent > previous) {
            previous = curent
        } else {
            stillSorted = false
        }
    }

    val result: String = if (stillSorted) "YES" else "NO"

    println(result)
}