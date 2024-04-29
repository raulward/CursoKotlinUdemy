package secao14

interface Wild {
    fun attack(){
        println("Attacking!")
    }
}

interface Docile {
    fun makeCuddle()
}

abstract class Mamiferus(val name: String) {
    fun wakeUp(){
        println("Wake up!")
    }
    fun sleep(){
        println("Sleeping Zzzz")
    }

    abstract fun speak()
}

class Dog2(name: String): Mamiferus(name), Wild, Docile{
    override fun speak() {
        println("AU AU!")
    }

    override fun makeCuddle() {
        println("S2")
    }
}

fun main() {
    val dog = Dog2("Mike")
    dog.speak()
    // val mamifero = Mamifero("Sem nome") --> Erro: Classe não pode ser instanciada
    dog.makeCuddle()
    dog.attack()
}