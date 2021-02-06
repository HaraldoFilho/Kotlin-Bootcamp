package lesson5

import kotlin.random.Random

const val MAX_BORROW = 5

fun main(args: Array<String>) {
    val book = Book("Fahrenheit 451", "Ray Bradbury", "1953", 325)
    val (title, author, year) = book.getAllBookInfo()
    println("Here is your book ${title} written by ${author} in ${year}.")

    println(book.canBorrow(5))
    println(book.canBorrow(3))

    book.printUrl()

    val puppy = Puppy()

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println(book.pages)
    }

}

class Book(val title: String, val author: String, val year: String, var pages: Int) {

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

fun Book.weight(): Double {
    return pages * 1.5
}

fun Book.tornPages(torn: Int) {
    if (torn < pages) pages -= torn else pages = 0
}

class Puppy {

    fun playWithBook(book: Book) {
        book.tornPages(Random.nextInt(1, book.pages+1))
    }

}