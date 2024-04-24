package secao7

fun main() {

    val salarioAna = 10000f
    val salarioPaula = 10000f

    var ammountAna = 0f
    var ammountPaula = 0f

    var count = 0

    do {
        ammountAna += ((salarioAna * 0.05f) * 2) + ammountAna * 0.002f
        ammountPaula += (salarioPaula * 0.05f) + ammountPaula * 0.008f
        count++
    } while (ammountAna > ammountPaula)

    println("O investimento de Paula passará Ana Paula em $count meses")

}