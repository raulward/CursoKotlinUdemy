package secao6

fun main() {
    var name: String = "Raul Ward de Araujo"

    println(name.length)
    println("A string começa com R (maiúsculo): ${name.startsWith("R")}")
    println("A string começa com R (independente): ${name.startsWith("r", true)}")
    println("A string começa com r (minúsculo): ${name.startsWith("r")}")

    println()

    println("A string termina com UJO (maiúsculo): ${name.endsWith("UJO")}")
    println("A string termina com ujo (independente): ${name.endsWith("UJO", true)}")
    println("A string termina com ujo (minúsculo): ${name.endsWith("ujo")}")

    println()

    println(name.substring(1, 10))

    println()

    println("Todos os caracteres minúsculos: ${name.lowercase()}")
    println("Todos os caracteres maiúsculos: ${name.uppercase()}")

    name = "         Raul Ward de Araujo                "

    println("Nome sem funçao trim: $name")
    println("Nome com a funcao trim: ${name.trim()}")

}