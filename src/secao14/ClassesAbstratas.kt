package secao14

abstract class Mamifero(val name: String) {
    fun wakeUp(){
        println("Wake up!")
    }
    fun sleep(){
        println("Sleeping Zzzz")
    }

    abstract fun speak()
}

class Dog(name: String): Mamifero(name){
    override fun speak() {
        println("AU AU!")
    }
}

fun main() {
    val dog = Dog("Mike")
    dog.speak()
    // val mamifero = Mamifero("Sem nome") --> Erro: Classe não pode ser instanciada
}