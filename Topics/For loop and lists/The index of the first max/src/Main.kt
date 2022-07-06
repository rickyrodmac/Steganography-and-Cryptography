fun main() {
    val num = readln().toInt()

    var maxValue = Int.MIN_VALUE
    var maxIndex = 0

    for (i in 0 until num) {
        val candidate = readln().toInt()
        if (candidate > maxValue) {
            maxValue = candidate
            maxIndex = i
        }
    }

    println(maxIndex)
}
