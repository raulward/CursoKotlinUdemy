package secao14

class Maths() {
    companion object {
        val PI = 3.141516
        val E = 2.717812
        init {
            println("Init do Companion Object")
        }
    }

    object Attrs {
        val inventededNumber = 10.2991
        init {
            println("Init do Object do ${this.toString()}")
        }
    }
}


fun main() {
    Maths.PI
    println(Maths.PI)
    println(Maths.Attrs.inventededNumber)
}