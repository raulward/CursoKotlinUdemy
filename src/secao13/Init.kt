package secao13

class Animal(specie: String) {
    var speak: String? = null
    init {
        speak = if (specie == "Cachorro") { "Au" }
        else if (specie == "Gato") {"Miau"}
        else {""}
    }

    fun makeSound() {
        println(this.speak)
    }
}


fun main() {

    val animal1 = Animal("Cachorro")
    println(animal1) // Endereço de memória da var. animal1
    animal1.makeSound()
    val animal2 = Animal("Gato")
    animal2.makeSound()
}