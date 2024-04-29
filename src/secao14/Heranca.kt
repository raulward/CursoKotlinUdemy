package secao14

open class Eletronic(var brand: String) {
    var state = false
    fun on(){
        state = true
    }

    fun off(){
        state = false
    }
}

class Computer(brand: String, var chipset: String): Eletronic(brand) {
    fun installSoftware(){

    }
}


fun main() {
    val computer = Computer("LENOVO", "AMD")
    println(computer.state)
    println(computer.chipset)
    computer.on()
    println(computer.state)
}