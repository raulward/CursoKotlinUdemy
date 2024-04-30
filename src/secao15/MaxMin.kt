package secao15

fun main() {
    val data = generateData()

    println(listOf(1, 2, 3, 4, 5, 6).max())
    println(data.maxOf { it.kcal })
    println(listOf(10, 2, 12, 20, -1).min())
    println(listOf<Int>().maxOrNull())
    println(listOf<Int>().minOrNull())
    println(data.maxByOrNull { it.kcal })
}