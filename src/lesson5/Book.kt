package lesson5

fun main(args: Array<String>) {
    val book = Book("Fahrenheit 451", "Ray Bradbury", "1953")
    val (title, author, year) = book.getAllBookInfo()
    println("Here is your book ${title} written by ${author} in ${year}.")
}

class Book(val title: String, val author: String, val year: String) {

    fun getTitleAndAuthor(): Pair<String, String> {
        return title to author
    }

    fun getAllBookInfo(): Triple<String, String, String> {
        return Triple(title, author, year)
    }

}