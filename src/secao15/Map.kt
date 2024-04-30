package secao15

fun main() {
    val map1: Map<Int, String> = mapOf(Pair(1, "Raul"), Pair(2, "Giulia"))
    val map2: MutableMap<String, Char> = mutableMapOf(Pair("A", 'A'), Pair("B", 'B'))

    println(map1)
    println(map1.entries)
    println(map1.values)

    println(map2)
    map2["C"] = 'C'
    println(map2)
    map2.remove("B")
    println(map2)
    println(map2.contains("A"))
    map2.clear()
    println(map2)
}