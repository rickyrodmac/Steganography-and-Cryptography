const val TWENTY = 20

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val ab = a + b == TWENTY
    val ac = a + c == TWENTY
    val bc = b + c == TWENTY

    val result = ab || ac || bc

    println(result.toString())
}