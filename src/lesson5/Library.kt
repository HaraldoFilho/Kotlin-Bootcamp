package lesson5

fun main(args: Array<String>) {

    val allBooks = setOf("The Trial", "The Metamorphosis", "Letter to his Father", "The Castle", "Amerika")
    val library = mapOf("Franz Kafka" to allBooks)

    println (library.any{it.value.contains("The Metamorphosis")})

    val moreBooks = mutableMapOf("Hamlet" to "William Shakespeare")

    println(moreBooks)

    moreBooks.getOrPut("The Miserables", { "Victor Hugo" })

    println(moreBooks)




}