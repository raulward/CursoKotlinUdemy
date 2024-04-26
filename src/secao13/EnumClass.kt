package secao13

enum class Priorities (val id: Int) {
    Low(1),
    Medium(5),
    High(10)
}

fun main() {
    val priorities = Priorities.values()
    for (p in priorities) {
        println("Priority: ${p} || ID: ${p.id}")
    }
}