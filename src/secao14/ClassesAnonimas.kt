package secao14

interface Event {
    fun onSuccess()
}

class Program {
    fun save(e: Event) {
        println("Opening connection...")
        println("Saving...")
        println("Closing connection...")
        e.onSuccess()
    }
}

fun main() {
    val p = Program()
    p.save(object : Event{
        override fun onSuccess() {
            println("onSuccess referenciado por object! (Classe anônima)")
        }
    })
}