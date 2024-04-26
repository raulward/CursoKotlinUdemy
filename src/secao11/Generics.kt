package secao11

fun main() {
    println(averageGenerics(8.9f, 10f, 4.5f, 9f))
    println(averageGenerics(false, true, 1, 10f, 20f, "hello world"))
}

fun <T, J> averageGenerics(any: J, vararg grades: T): Float {
    var sum = 0f
    for (grade in grades) {
        if (grade is Float) {
            sum += grade
        }

    }
    return sum / grades.size
}