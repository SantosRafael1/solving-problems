
fun main() {
    println(countWord("Hello, World!"))
    println(countWord("Challenge yourself!"))
    println(countWord("This is another test."))
}

fun countWord(sentence: String): Int {
    val words = sentence.split("\\s".toRegex())
    return words.size
}