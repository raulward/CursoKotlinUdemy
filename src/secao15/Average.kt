package secao15

fun main() {
    val data = generateData()
    val numList = listOf(10, 8, 9, 12)

    println(data.map { it.kcal }.average())
    println(numList.average())

}