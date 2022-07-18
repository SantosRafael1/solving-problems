//Create a function that takes two strings and returns true 
//if the first string ends with the second string; otherwise return false.

fun checkEnding(str1: String, str2: String): Boolean {
    if(str1.endsWith(str2)) return true
    return false
}

fun main() {
    println(checkEnding("hello", "lo"))
    println(checkEnding("dcv", "cv"))
    println(checkEnding("music", "sik"))
}
