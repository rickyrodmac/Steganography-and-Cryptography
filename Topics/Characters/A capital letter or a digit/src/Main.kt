fun main() {
    val ch: Char = readln().first()

    println(
        ch.isUpperCase() || ch.isDigit() && ch != '0'
    )
}