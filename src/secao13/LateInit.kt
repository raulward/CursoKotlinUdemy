package secao13

class Recipe() {

    lateinit var instructions: String

    fun setInstruction(instruction: String) {
        this.instructions = instruction
    }

    fun printInstructions() {
        if (this::instructions.isInitialized) {
            println(instructions)
        } else {
            println("Variável nao inicializada.")
        }
    }

}


fun main() {

    var r: Recipe = Recipe()
//    r.instructions Erro ---> Variável instructions nao inicializada
//    r.printInstructions() Erro ---> Variável instructions nao inicializada
    r.setInstruction("Wash your hands.")
    r.printInstructions()
}