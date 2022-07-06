// don't change the code below      
fun totalLembas(first: String, second: String) = print(first.toInt() + second.toInt())

fun main() {
    val breadFromFrodo = readln()
    val breadFromSam = readln()

    val frodoInt = breadFromFrodo.toInt()
    val samInt = breadFromSam.toInt()

    val total = totalLembas(frodoInt, samInt)

    println(total)

}

fun totalLembas(a: Int, b: Int): Int {
    return a + b
}
