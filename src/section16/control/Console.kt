package section16.control

class Console {
    companion object {
        fun readInt(msg: String): Int {

            var callback: Int? = null

            do {
                print(msg)
                val info = readLine()
                if (info != null && info != "") {
                    callback = info.toIntOrNull()
                    if (callback == null || callback <= 0) {
                        println("Valor invalido.")
                    }
                } else {
                    println("Valor invalido.")
                }
            } while (callback == null || callback <= 0)

            return callback
        }

        fun readString(msg: String): String {

            var callback: String? = null

            do {
                print(msg)
                val info = readLine()
                if (info != null && info != "") {
                    callback = info.lowercase()
                } else {
                    println("Valor invalido.")
                }
            } while (callback == null)

            return callback
        }

    }
}