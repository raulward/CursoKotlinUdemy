package secao7

fun main() {

    var soma = 0
    var count = 0

    while (soma < 2000) {
        soma += 7
        if (soma > 2000) break
        count++
    }

    println(count)

//    var i = 1
//    while (i <= 50) {
//        if (i % 3 == 0 && i % 5 == 0) println("FizzBuzz")
//        else if (i % 3 == 0) println("Fizz")
//        else if (i % 5 == 0) println("Buzz")
//        else println(i)
//        i++
//    }

    println(reversed("Raul Ward de Araujo"))

    println(countXO("xxxoooxxxooo"))
    println(countXO("xxxoooxxxoo"))

}

fun reversed(str: String): String {

    var i = str.length - 1
    var newStr = ""
    while (i >= 0) {
        newStr += str[i]
        i--
    }
    return newStr

}

fun countXO(str: String): Boolean {
    var i = 0
    var countX = 0
    var countO = 0
    val strLower = str.lowercase()
    while (i < str.length) {
        if (strLower[i] == 'x') countX++
        else if (strLower[i] == 'o') countO++
        i++
    }

    return countX == countO

}