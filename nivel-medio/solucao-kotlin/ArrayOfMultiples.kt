

import java.util.Arrays
fun main() {
    println(Arrays.toString(returnMultiples(3, 5)))
}

fun returnMultiples(number: Int, length: Int): IntArray {
    var numbers = IntArray(length)

    var i = 1
    while(i < numbers.size){
        numbers[i] = (number * i)
        i++
    }
    return numbers
}