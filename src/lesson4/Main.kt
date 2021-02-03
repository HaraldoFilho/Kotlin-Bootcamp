package lesson4

fun main(args: Array<String>) {

    fun makeSalt() = Spice("salt", "light")

    val spicies = listOf(
            Spice("curry"),
            Spice("pepper", "spicy"),
            Spice("cayenne", "mild"),
            Spice("ginger", "mild"),
            Spice("red curry", "hot"),
            Spice("green curry", "not spicy"),
            Spice("red pepper", "hot"),
            makeSalt()
    )

    val iterator = spicies.filter { it.heat <= 75 }.listIterator()

    print("Less spicy: ")
    while (iterator.hasNext()) {
        val spice = iterator.next()
        print(spice.name + " ")
    }

    println("\n----------------------------------------------------------------------")

    val book1 = Book("1984", "George Orwell")
    val book2 = Book("Brave New World", "Aldous Huxley")
    val book3 = eBook("Fahrenheit 451", "Ray Bradbury")

    book1.readPage()
    book1.readPage()
    book1.readPage()

    book2.readPage()
    book2.readPage()

    book3.readPage()
    book3.readPage()

}