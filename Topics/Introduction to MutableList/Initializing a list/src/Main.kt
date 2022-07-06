const val HUNDRED = 100
const val TEN = 10

fun main() {
    val numbers = MutableList(HUNDRED) { 0 }

    numbers[0] = 1
    numbers[TEN - 1] = TEN
    numbers[HUNDRED - 1] = HUNDRED

    // do not touch the lines below 
    println(numbers.joinToString())
}