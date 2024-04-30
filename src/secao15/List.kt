package secao15

fun main() {
    val lst1: List<Int> = listOf(1, 2, 3, 4, 5)
    val lst2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

    println(listOf(1, 2, 3, 4, 5, 6))
    println(mutableListOf(1, 2, 3, 4, 5, 6))

    println("Tamanho lst1 = ${lst1.size}")
    println("Tamanho lst2 = ${lst2.size}")

    println("Lst2 tem 7: ${lst2.contains(7)}")
    lst2.add(7)
    println("Lst2 tem 7: ${lst2.contains(7)}")
    lst2.removeAt(0)
    println(lst2)


}