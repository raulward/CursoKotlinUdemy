package secao15

fun main() {
    val data = generateData()

    println("Tenho dados? ${if (data.any()) "sim" else "não"}")
    println("Tenho ${data.count()} elementos.")
}

fun generateData(): List<Recipe> {
    return listOf(
        Recipe(
            "Lasanha", 1200,
            listOf(
                Ingredient("Presunto", 5),
                Ingredient("Queijo", 10),
                Ingredient("Molho de tomate", 2),
                Ingredient("Manjerição", 3)
            )
        ),
        Recipe("Panqueca", 500),
        Recipe("Omelete", 200),
        Recipe("Parmegiana", 700),
        Recipe("Sopa de feijão", 300),
        Recipe(
            "Hamburguer", 2000,
            listOf(
                Ingredient("Pão", 1),
                Ingredient("Hamburguer", 3),
                Ingredient("Queijo", 1),
                Ingredient("Catupiry", 1),
                Ingredient("Bacon", 3),
                Ingredient("Alface", 1),
                Ingredient("Tomate", 1)
            )
        )
    )
}

data class Recipe(val name: String, val kcal: Int, var ingredients: List<Ingredient> = listOf())
data class Ingredient(val name: String, var quantity: Int)