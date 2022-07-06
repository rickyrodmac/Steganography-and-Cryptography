import java.util.Scanner

const val COLLATZ = 3

fun main() {
    val scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    while (num != 1) {
        print("$num ")
        if (num % 2 == 0) {
            num /= 2
        } else {
            num = num * COLLATZ + 1
        }
    }
    println(1)
}

