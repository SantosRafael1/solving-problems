fun main() {
    println(areEqual(5, 5))
    println(areEqual(2, 3))
}

private fun areEqual(number1: Int, number2: Int): Boolean {
    val result = number1 == number2
    return result
}