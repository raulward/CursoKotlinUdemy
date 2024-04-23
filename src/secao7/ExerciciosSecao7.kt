package secao7

fun main() {
    calculateBonus("Gerente")
    calculateBonus("Estágiario")
    calculateBonusWithExperience("Gerente", 2)
    calculateBonusWithExperience("Engenheiro de Software", 5)
}

fun calculateBonus(office: String): Unit {
    if(office == "Gerente") {
        println("Bonus de R$ 2000,00")
    } else if (office == "Coordenadores") {
        println("Bonus de R$ 1500,00")
    } else if (office == "Engenheiro de Software") {
        println("Bonus de R$ 1000,00")
    } else if (office == "Estágiario") {
        println("Bonus de R$ 500,00")
    }
}

fun calculateBonusWithExperience(office: String, experience: Int): Unit {
    if(office == "Gerente") {
        if (experience < 2) println("Bonus de R$ 2000,00")
        else println("Bonus de R$ 3000,00")
    } else if (office == "Coordenadores") {
        if (experience < 1) println("Bonus de R$ 1500,00")
        else println("Bonus de R$ 1800,00")
    } else if (office == "Engenheiro de Software") {
        println("Bonus de R$ 1000,00")
    } else if (office == "Estágiario") {
        println("Bonus de R$ 500,00")
    } else {
        println("Cargo inválido")
    }
}

/*
3)
a. False
b. True
c. False
d. True
 */