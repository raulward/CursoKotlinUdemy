package section16.control

import section16.business.GuestBussiness
import section16.entity.Guest

class Entrance {

    private val console = Console

    init {
        println("Portaria inicializada")
        println(control())
    }

    private fun control(): String {
        val age = console.readInt("Digite sua idade: ")
        val guest: Guest = Guest(age = age)
        if (!GuestBussiness.validateAge(age)) {
            return "Negado. Menores de idade nao sao permitidos."
        }

        guest.inviteType = console.readString("Digite o tipo de convite: ")
        if (!GuestBussiness.validateInviteType(guest.inviteType)) {
            return "Negado. Tipo de convite inválido"
        }

        guest.code = console.readString("Digite o código do convite: ")
        if (!GuestBussiness.validateCode(guest)) {
            return "Negado. Código do convite inválido"
        }

        return "Welcome! :)"

    }


}

fun portaria() {

    /* print("Qual sua idade? ")
     val idade = readLine()

     if (idade != null && idade != "") {
         if (idade.toInt() < 18) {
             println("Negado. Menores de idade não são permitidos.")
             return
         }
     }*/

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()

        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }

        print("Qual o código do convite? ")
        var codigo = readLine()

        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()

            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. Convite inválido")
            }
        }
    }
}

