package secao23

interface EventListener {
    fun click()
}

class Form {
    fun clickJava (e: EventListenerJava) {}
    fun clickKotlin (e: EventListener) {}
}

class Main{
    fun main() {
        Form().clickJava { println("Click Java!") }
        Form().clickKotlin(object: EventListener {
            override fun click() {
                println("Click Kotlin!")
            }

        })
    }
}

fun main() {
    Main().main()
}