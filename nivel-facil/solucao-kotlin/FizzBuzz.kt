
fun main() {
    fizzBuzz(5)
    fizzBuzz(3)
    fizzBuzz(15)
    fizzBuzz(4)
}

fun fizzBuzz(number: Int): Unit {

    if(number % 3 == 0 && number % 5 == 0) {
        println("FizzBuzz")
    } else if(number % 3 == 0) {
        println("Fizz")
    } else if(number % 5 == 0) {
        println("Buzz")
    } else {
        println(number)
    }

}