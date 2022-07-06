import kotlin.Exception

fun calculateBrakingDistance(v1: String, a: String): Int {
    try {
        val intV1 = v1.toInt()
        return (0 - intV1 * intV1) / (2 * a.toInt())
    } catch (e: java.lang.ArithmeticException) {
        println("The car does not slow down!")
    } catch (e: Exception) {
        println(e.message)
    }
    return -1
}
