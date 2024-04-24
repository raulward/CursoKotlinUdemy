package secao7

fun main() {

    for (i in 1..50) {
        print("$i ")
    }

    println()
    println()

    for (i in 50 downTo 1) {
        print("$i ")
    }

    println()
    println()

    for (i in 1..50) {
        if (i % 5 != 0) print("$i ")
    }

    var sum: Int = 0

    for (i in 1..500) {
        sum += i
    }

    println()
    println()

    println(sum)

    println()
    println()

    writeHashtag(5)



}

fun writeHashtag(number: Int) {
    for (i in 1..number) {
        println("#".repeat(i))
    }
}