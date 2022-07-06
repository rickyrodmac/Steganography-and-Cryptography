fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(
        if (a + b > c && b + c > a && a + c > b) {
            "YES"
        } else {
            "NO"
        }
    )
}