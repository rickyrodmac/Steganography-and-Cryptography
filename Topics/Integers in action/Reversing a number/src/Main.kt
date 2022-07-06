const val TEN = 10
const val HUNDRED = 100
const val THOUSAND = 1000

fun main() {
    val input = readln().toInt()

    val ones = input % TEN
    val tens = (input - ones) % HUNDRED / TEN
    val hundreds = (input - ones - tens) % THOUSAND / HUNDRED

    println("$ones$tens$hundreds")
}