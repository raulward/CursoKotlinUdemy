package secao6

fun main() {
    countYears(10)
    println(strLen("HOJE É MEU ANIVERSARIO!"))
    println(cubeInt(2))
    println(convertMilesToKm(102.12f))
    println(replaceAForX("Amanda"))
}

fun countYears(years: Int) : Unit {

    var months: Int = years * 12
    var days: Int = years * 365
    var hours: Int = years * 365 * 24
    var minutes: Int = years * 365 * 24 * 60
    var seconds = years * 365 * 24 * 60 * 60

    println("$years anos equivalem a: ")
    println("$months meses")
    println("$days dias")
    println("$hours horas")
    println("$minutes minutos")
    println("$seconds segundos")
}

fun strLen(str: String): Int = str.length

fun cubeInt(num: Int): Int = num * num * num

fun convertMilesToKm(miles: Float): Float = miles * 1.6f

fun replaceAForX(str: String): String = str.lowercase().replace("a", "x")