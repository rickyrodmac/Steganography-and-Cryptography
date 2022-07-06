fun main() {
    val word = readln()
    val len: Int = word.length

    println("$len repetitions of the word $word: ${word.repeat(len)}")
}