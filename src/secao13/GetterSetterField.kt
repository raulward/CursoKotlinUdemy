package secao13

class Brand(name: String) {
    var country: String = ""
        get() {
            if (field == "USA") {
                println("NIKE!")
            }
            return field
        }
        set(value) {
            println("Acesso setter")
            field = value
        }
}


fun main() {
    var brand: Brand = Brand("Nike")
    brand.country = "USA" // Setter
    println(brand.country) // Getter
}