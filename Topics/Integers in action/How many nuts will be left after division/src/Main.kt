fun main() {
    val nSquirrels = readln().toInt()
    val kNuts = readln().toInt()
    val result = kNuts % nSquirrels

    println(result.toString())
}