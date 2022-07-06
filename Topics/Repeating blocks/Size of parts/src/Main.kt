const val PERFECT = 0
const val LARGER = 1
const val SMALLER = 2

fun main() {
    val parts = readln().toInt()

    val result = intArrayOf(0, 0, 0)

    repeat(parts) {
        when (readln()) {
            "0" -> result[PERFECT]++
            "1" -> result[LARGER]++
            "-1" -> result[SMALLER]++
        }
    }

    println("${result[PERFECT]} ${result[LARGER]} ${result[SMALLER]}")
}