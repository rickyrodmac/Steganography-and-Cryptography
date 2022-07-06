fun main() {
    val (n1, op, n2) = readln().split(" ")

    val num1 = n1.toLong()
    val num2 = n2.toLong()

    println(
        when (op) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 == 0L) "Division by 0!" else num1 / num2
            else -> "Unknown operator"
        }
    )
}