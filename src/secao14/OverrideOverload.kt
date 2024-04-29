package secao14

open class Eletro(val brand: String) {
    private var AC = false

    protected fun activateAC(){ AC = true }

    fun on() { activateAC() }

    open fun off() { AC = false }

}

class SmartPhone(brand: String): Eletro(brand) {
    fun save() {}

    fun save(db: String) {}

    fun save(file: Int) {}

    override fun off() {
        save()
        super.off()
    }

}



fun main() {

    val android = SmartPhone("Android")
    android.on()
    android.save()
    android.save("names.JSON")
    android.save(10)
    android.off()
}