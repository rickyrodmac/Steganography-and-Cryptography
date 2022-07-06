fun main() {
    val sequenceLength = readln().toInt()

    var positives = 0

    repeat(sequenceLength) {
        if (readln().toInt() > 0) positives++
    }

    println(positives)
}