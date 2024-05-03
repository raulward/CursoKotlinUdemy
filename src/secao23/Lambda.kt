package secao23

fun main() {
    val a = { println("Hello Lambda! ")}
    val b = {x: Int -> x * x}
    val c = { x: Int, y: Int ->
        println("Executando")
        x * y
    }

    receiveA(a())
    receiveB(b)
    receiveC { x, y -> x * y }
    receiveC(c)
}

fun receiveA(lambda: Unit) { }
fun receiveB(lambda: (i: Int) -> Int) {}
fun receiveC(lambda: (x: Int, y: Int) -> Int) {}

