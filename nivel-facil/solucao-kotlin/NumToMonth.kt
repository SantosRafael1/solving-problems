
fun main() {
    println("Enter number: ")
    val number = readLine()!!.toInt() 

    val months = arrayOf("January", "February", "March","April", "May", "June", "July", "August", "September", "October", "November", "December")

    if(number < 1 || number > 12) println("No month for number ${number}")
    else println(months[number - 1])
}