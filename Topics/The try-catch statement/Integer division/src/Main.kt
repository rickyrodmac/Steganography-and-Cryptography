fun intDivision(x: String, y: String): Int {
    try {
        return x.toInt() / y.toInt()
    } catch (e: java.lang.NumberFormatException) {
        println("Read values are not integers.")
    } catch (e: java.lang.ArithmeticException) {
        println("Exception: division by zero!")
    }
    return 0
}

fun main() {
    val x = readLine()!!
    val y = readLine()!!
    println(intDivision(x, y))

}