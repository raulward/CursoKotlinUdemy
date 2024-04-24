package secao8

fun main() {
    try {
        var s: String? = null
//        var b = 10 /0

        println(s!!.length)

    } catch (e: NullPointerException) {
        println("Exceçao: ${e}")
    } catch (e: ArithmeticException) {
        println("Excecao: ${e}")
    } catch (e: Exception) {
        println("Excecao genérica: ${e}")
    } finally {
        println("Finally")
    }
}