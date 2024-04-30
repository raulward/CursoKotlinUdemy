package section16

class Console {
    companion object{
        fun readInt(msg: String): Int {
            do {
                print(msg)
                val info = readLine()
                return if (info != null && info != "") {
                    val pushback = info.toIntOrNull()
                    if (pushback == null) {
                        readInt("Valor invalido. Digite sua idade novamente: ")
                    }
                } 
            } while (info == null || info == "")
        }

        fun readInviteType(msg: String): String {
            do {
                print(msg)
                val info = readLine()
                return if (info != null && info != "") {
                    info
                } else {
                    readInviteType("Valor invalido. Digite novamente o tipo de convite: ")
                }
            } while (info == null || info == "")
        }

        fun readInviteCode(msg: String): String {
            do {
                print(msg)
                val info = readLine()
                return if (info != null && info != "") {
                    info
                } else {
                    readInviteType("Valor invalido. Digite novamente o codigo de convite: ")
                }
            } while (info == null || info == "")
        }
    }
}