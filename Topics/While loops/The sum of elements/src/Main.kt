fun main() {
    var sum = 0
    do {
        val element = readln().toInt()
        sum += element
    } while (element != 0)
    println(sum)
}