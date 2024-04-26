package secao13

class Bank(val agenceNumber: Int, bankName: String) {

    var balance: Float? = null
    constructor(agenceNumber: Int, bankName: String, balance: Float): this(agenceNumber, bankName) {
        this.balance = balance
    }

}



fun main() {
    val bank1: Bank = Bank(391010, "Caixa")
    val bank2: Bank = Bank(210231, "Itaú", 1000f)

    println(bank2.balance)
}