const val MAX_UNSIGNED_BYTE = 255

fun printARGB() {
    // Write your code here
    val validRange = 0..MAX_UNSIGNED_BYTE
    val (alpha, red, green, blue) = readln().split(" ").map { it.toInt() }

    if (alpha !in validRange ||
        red !in validRange ||
        green !in validRange ||
        blue !in validRange
    ) {
        println("Invalid input")
    } else {
        val aRGB = Color(red, green, blue, alpha)
        println(aRGB.rgb.toUInt())
    }
}
