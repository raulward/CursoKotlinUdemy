package secao7

fun main() {
//    println(isSquare())
//    println()
//    println(isIsosceles())
    entrance()
}

fun isSquare(): String {

    println("Digite o valor do primeiro lado: ")
    val side1 = readLine()
    println("Digite o valor do segundo lado: ")
    val side2 = readLine()

    if (side1 != "" && side2 != "") {
        return if (side1 == side2) "Quadrado"
        else "Retangulo"
    } else {
        println("Números inválidos.")
        println()
        return isSquare()
    }
}

fun isIsosceles(): String {

    println("Digite o primeiro lado: ")
    val side1 = readLine()

    println("Digite o segundo lado: ")
    val side2 = readLine()

    println("Digite o terceiro lado: ")
    val side3 = readLine()

    if (side1 != "" && side2 != "" && side3 != "") {
        return if (side1 == side2 && side1 == side3) "Equilátero"
        else return "Isósceles ou escaleno"
    } else {
        println("Valores inválidos")
        return isIsosceles()
    }

}

/*
3. Terceira String
 */

fun entrance() {

    println("Digite sua idade: ")
    val age = readLine()

    if (age != null && age != "") {

        if (age.toInt() >= 18) {

            println("Digite o tipo de convite: ")
            var inviteType = readLine()

            if (inviteType != null && inviteType != "") {

                inviteType = inviteType.lowercase()

                if (inviteType == "comum" || inviteType == "luxo" || inviteType == "premium") {

                    println("Digite o código do convite: ")
                    var code = readLine()

                    if (code != null && code != "") {

                        code = code.lowercase()

                        if ( ((inviteType == "premium" || inviteType == "luxo") && code.startsWith("xl")) || (inviteType == "comum" && code.startsWith("xt"))) {
                            println("Welcome :)")
                        } else {
                            println("Negado. código de convite inválido")
                            return
                        }

                    } else {
                        println("Valor inválido para código de convite.")
                        entrance()
                    }

                } else {
                    println("Negado. Tipo de convite inválido.")
                    return
                }

            } else {
                println("Valor inválido para convite.")
                return entrance()
            }

        } else {
            println("Negado. Menores de idade nao sao permitidos.")
            return
        }

    } else {

        println("Valor inválido para idade.")
        return entrance()

    }
}