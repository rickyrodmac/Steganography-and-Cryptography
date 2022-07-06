const val HUNDRED = 100
const val TEN = 10

fun main() {
    val numbers = IntArray(HUNDRED)

    numbers[0] = 1
    numbers[TEN - 1] = 10
    numbers[HUNDRED - 1] = 100

    // do not touch the lines below
    println(numbers.joinToString())
}