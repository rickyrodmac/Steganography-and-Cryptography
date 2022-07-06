fun isVowel(char: Char): Boolean {
    return "aeiou".contains(char.lowercaseChar())
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}