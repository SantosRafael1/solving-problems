
fun main() {
    println(isDivisibleByFive(-55))
}

fun isDivisibleByFive(number: Int): Boolean {
    val result: Boolean = number % 5 == 0
    return result
}