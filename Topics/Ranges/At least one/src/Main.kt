fun main() {
    val r1a = readln().toInt()
    val r1b = readln().toInt()
    val r2a = readln().toInt()
    val r2b = readln().toInt()
    val num = readln().toInt()

    println(num in r1a..r1b || num in r2a..r2b)
}