package secao15

fun main() {
    val data = generateData()
    val nonCaloricRecipes = data.filter { it.kcal < 500 }.forEach() {
        println(it.name)
    }
}