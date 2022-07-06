fun main() {
    val num = readln().toInt()
    val bot = readln().toInt()
    val top = readln().toInt()

    println(num in bot..top)
}