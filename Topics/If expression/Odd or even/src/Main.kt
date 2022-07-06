fun main() {
    val num = readln().toInt()

    println(
        if (num % 2 == 0) {
            "EVEN"
        } else {
            "ODD"
        }
    )
}