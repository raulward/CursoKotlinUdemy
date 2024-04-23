package secao7

fun main() {

    val bonus1 = calculateBonusWithWhen("Gerente")
    val bonus2 = calculateBonusWithWhen("Engenheiro de Software")

    println("Bonus da primeira pessoa: R$ $bonus1")
    println("Bonus da segunda pessoa: R$ $bonus2")

}

fun calculateBonusWithWhen(office: String): Float {
    return when (office) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}