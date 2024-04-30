package secao15

fun main() {
    val list = listOf(1, 1, 1, 1, 10, 10, 23, 21, 2, 3, 4, 5, 1, 5)

    println("Lista sem elementos repetidos: ${list.distinct()}")
    println("Lista sem elementos repetidos e ordenada: ${list.distinct().sorted()}")
    println("Lista sem elementos repetidos e ordenada de forma decrescente: ${list.distinct().sortedDescending()}")
    println("Lista sem elementos repetidos e inversa (index): ${ list.distinct().reversed() }")

}