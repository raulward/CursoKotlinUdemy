package secao15

fun main() {

    val data = generateData()
    println(data.map { NIngredientsRecipe(it.name, it.ingredients.count()) })

}

data class NIngredientsRecipe(val name: String, val nIngredients: Int)