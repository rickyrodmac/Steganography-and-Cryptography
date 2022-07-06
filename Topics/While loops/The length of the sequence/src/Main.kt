import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var count = 0
    while (scanner.hasNext()) {
        val next = scanner.nextInt()
        if (next > 0) {
            count += 1
        } else {
            break
        }
    }
    println("$count")
}
