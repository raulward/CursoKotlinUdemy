package secao14

private class Vip()

open class Eletronic2(val brand: String) {
    private var AC = false
    private fun activateAC() {
        AC = true
    }
    fun on(){
        activateAC()
    }
    fun off(){
        AC = false
    }
    fun getState(): Boolean {
        return AC
    }
}

class Computer2(brand: String): Eletronic2(brand) {
    fun process(){}
    fun installSoftware(){}
}

fun main() {
    val computer2 = Computer2("Logitech")
    println(computer2.getState())
    computer2.on()
    println(computer2.getState())
//    computer2.AC --> Erro: atributo privado
//    computer2.activateAC --> Erro: método privado
}