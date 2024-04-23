package secao6

fun helloWorld(name: String): String {
    return "Hello $name"
}

fun sum(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main() {
    println(helloWorld("Raul"))
    println(sum(5, 10))
}

