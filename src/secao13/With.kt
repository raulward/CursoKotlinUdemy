package secao13

fun main() {
    val p: Person = Person(2004, "Raul", "102391123")

    with(p) {
        wakeUp()
        sleep()
        println(wakeUp)
        println(name)
        println(birthYear)
    }
}

