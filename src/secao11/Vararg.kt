package secao11

fun main() {
    println(average(8.9f, 10f, 4.5f, 9f))
    println(average(4.5f, 9f))
    println(average(4.5f, 9f, 10f, 8f, 5.21f, 1.3f))
}

fun average(vararg grades: Float): Float {
    var sum = 0f
    for (grade in grades) {
        sum += grade
    }
    return sum / grades.size
}