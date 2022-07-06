@SuppressWarnings("MagicNumber")

fun main() {
    val size = readln().toInt()

    println(
        when {
            size in 1..4 -> "few"
            size in 5..9 -> "several"
            size in 10..19 -> "pack"
            size in 20..49 -> "lots"
            size in 50..99 -> "horde"
            size in 100..249 -> "throng"
            size in 250..499 -> "swarm"
            size in 500..999 -> "zounds"
            size >= 1000 -> "legion"
            else -> "no army"
        }
    )
}