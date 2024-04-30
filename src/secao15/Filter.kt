package secao15

fun main() {
    val data = generateData()
    val hamburgerRecipe = data.filter { it.name == "Lasanha" }
    val caloricRecipes = data.filter { it.kcal > 500 }
    val numList: List<Int> = listOf(1, 2, 4, 5, 10, 15)
    println("Receita de lasanha: $hamburgerRecipe")
    println("Receitas com mais de 500 kcal: ${caloricRecipes}")
    println("Números maiores que 10: ${numList.filter { it >= 10 }}")

}

