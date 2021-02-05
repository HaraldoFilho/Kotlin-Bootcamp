package lesson5

const val MAX_BORROW = 5

fun main(args: Array<String>) {
    val book = Book("Fahrenheit 451", "Ray Bradbury", "1953")
    val (title, author, year) = book.getAllBookInfo()
    println("Here is your book ${title} written by ${author} in ${year}.")

    println(book.canBorrow(5))
    println(book.canBorrow(3))

    book.printUrl()

}

class Book(val title: String, val author: String, val year: String) {

    companion object {
        const val BASE_URL = "https://www.library.net/"
    }

    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getAllBookInfo(): Triple<String, String, String> {
        return Triple(title, author, year)
    }

    fun canBorrow(borrowed: Int ): Boolean {
        return borrowed < MAX_BORROW
    }

    fun printUrl() {
        println(BASE_URL + title.replace(" ", "_") + ".html")
    }

}