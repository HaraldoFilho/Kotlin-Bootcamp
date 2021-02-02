package lesson4

class Spice (val name: String, private val spiciness: String = "mild") {

    val heat: Int
        get() {
            return when (spiciness) {
                "hot" -> 100
                "spicy" -> 75
                "mild" -> 50
                "not spicy" -> 25
                else -> 0
            }
        }

    init {
        println("Spice name: $name, spiciness: $spiciness")
    }

}