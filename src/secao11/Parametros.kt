package secao11

fun main() {
    endereco("Brazil", "Brasilia", "Rua 20")
    endereco(city = "Aracaju", street = "Rua Almeida", state = "BR", num = 10, cep = "8191031")

}

fun endereco(state: String, city: String, street: String, num: Int = 0, cep: String = ""){}