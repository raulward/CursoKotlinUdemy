package secao14

interface Employee {
    var sallary: Float
    fun bonus(): Float
}

class Manager(override var sallary: Float) : Employee {
    override fun bonus(): Float {
        return sallary * 0.5f
    }
}

class Programmer(override var sallary: Float): Employee {
    override fun bonus(): Float {
        return sallary * 0.17f
    }
}

abstract class Enterprise(val branch: String) {

    abstract fun assign(office: String): String
}

class Coke(branch: String): Enterprise(branch) {
    override fun assign(office: String): String {
        return "Assign with ${office}"
    }
}

fun bonus(employee: Employee) {
    println(employee.bonus())
}

fun assign(enterprise: Enterprise, office: String) {
    println(enterprise.assign(office))
}

fun main() {
    bonus(Programmer(1000f))
    bonus(Manager(2009f))
    assign(Coke("Alimentos"), "Manager")
}