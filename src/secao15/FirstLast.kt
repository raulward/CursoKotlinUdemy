package secao15


fun main() {
    val data = generateData()

    println("Primeira receita: ${data.first().name}")
    println("Última receita: ${data.last().name}")

    println(listOf<Int>().firstOrNull())
    println(listOf<Int>().lastOrNull())
}

