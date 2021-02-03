package lesson4.Spicies

fun main(args: Array<String>) {

    val curry = Curry("curry", "mild")
    println(curry.color)

    val spice1 = SpiceContainer(Curry("yellow curry", "mild"))
    val spice2 = SpiceContainer(Curry("red curry", "spicy"))
    val spice3 = SpiceContainer(Pepper("pepper", "spicy"))

    println(spice1.label)
    println(spice2.label)
    println(spice3.label)

}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor): SpiceColor by color {
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor: SpiceColor {
    override val color = "yellow"
}

object RedSpiceColor: SpiceColor {
    override val color = "red"
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
    }

}

class Pepper(name: String, spiciness: String,
            color: SpiceColor = RedSpiceColor) : Spice(name, spiciness, color), Grinder {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
    }

}

data class SpiceContainer(val spice: Spice) {
    val label = spice.name
}
