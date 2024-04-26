package secao13

class Person(val birthYear: Int, var name: String, cpf: String) {

    var wakeUp: Boolean = false

    fun sleep(){
        println("ZzzzZzzzZzzz")
        wakeUp = false
    }

    fun wakeUp() {
        println("Uaaaa")
        wakeUp = true
    }

}


fun main() {
    val person: Person = Person(2004, "Raul", "012391012-21")
    println(person.name)
    println(person.birthYear)
    println(person.wakeUp)
    person.wakeUp()
    println(person.wakeUp)
    person.sleep()
    println(person.wakeUp)
//    println(person.cpf) --> Acesso da variável "cpf" negado.
}