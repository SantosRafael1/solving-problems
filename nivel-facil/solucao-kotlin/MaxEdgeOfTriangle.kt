
fun main() {
    println(nextEdge(5, 7))
}

fun nextEdge(side1: Int, side2: Int): Int {
    return (side1 + side2) - 1
}