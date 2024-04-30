package secao15

fun main() {
    val data = generateData()
    val numList = listOf<Int>(1, 2, 3, 4, 5)

    println("Soma de todos os elementos presentes: ${numList.sum()} ")
    println("Soma das calorias de todas as receitas: ${data.sumOf { it.kcal }}")
}

