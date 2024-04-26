package secao13

fun main() {
    val f1 = Form1(1, 2)
    val f2 = Form1(1, 2)

    println("----------")
    println(f1.equals(f2))
    println(f1.a.equals(f2.a))

    println("----------")
    println(f1.toString())
    println(f1.hashCode())
    println("----------")
    println(f2.toString())
    println(f2.hashCode())


    println("------------")
    println()

    val f3 = Form2(1, 2)
    val f4 = Form2(1, 2)

    val f5 = f4.copy()

    println(f3.equals(f4))
    println(f3.a.equals(f4.a))

    println("----------")
    println(f3.toString())
    println(f3.hashCode())
    println("----------")
    println(f4.toString())
    println(f4.hashCode())
    println("----------")
    println(f4.equals(f5))
    println("----------")
}



class Form1(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Form1) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }

    override fun toString(): String {
        return "${this.a} + ${this.b}"
    }
}

data class Form2(val a: Int, val b: Int) {

}