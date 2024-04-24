package secao8

fun main() {
    var s: String = "Nao sou nulo"
//    var p: String = null  ----> Nao compila
    var t: String? = null
    var u: String?

    u = readLine()

    var v = readLine()

    println(s.length) // Saída: 12
    println(t?.length) // Saída: null
    println(u?.length) // Saída: 0
    println(v!!.length) // Saída: 0

}