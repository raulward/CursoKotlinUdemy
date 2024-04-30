package secao15

fun main() {
    val set1: Set<String> = setOf("Madrid", "Brasília", "Orlando", "Brasília")
    val set2: MutableSet<String> = mutableSetOf("João", "Maria", "Carlos")

    println(set1)
    set2.add("Marcos")
    println(set2)
    set2.add("João")
    println(set2)
    println(set2.contains("Maria"))
    set2.remove("Maria")
    println(set2.contains("Maria"))
    println(set2.clear())
    println(set2)
}