
fun main() {
    println(findPerimeterOfRetangle(20, 10))
}

fun findPerimeterOfRetangle(length: Int, width: Int): Int {
    return length + length + width + width
}