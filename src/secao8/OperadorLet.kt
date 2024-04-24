package secao8

fun main() {
    val s: String? = null
    val s2: String = "NAO NULO"

    s?.let {
        println(it.lowercase())
        println(it.length)
    } // Nao é executado

    s2?.let {
        println(it.lowercase())
        println(it.length)
    }

}