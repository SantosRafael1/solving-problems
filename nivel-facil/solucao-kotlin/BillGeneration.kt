fun main() {
    println("No of pizzas bought: ")
    val pizzas = readLine()!!.toInt()
    println("No of puffs bought: ")
    val puffs = readLine()!!.toInt()
    println("No of drinks bought: ")
    val drinks = readLine()!!.toInt()

    val totalPrice = (pizzas * 100 + puffs * 20 + drinks * 10)

    println("Total Price: " + totalPrice)
}