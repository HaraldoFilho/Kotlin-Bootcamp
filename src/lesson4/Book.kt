package lesson4

open class Book(val title: String, val author: String) {

    private var currentPage: Int = 0

    open fun readPage() {
        currentPage++
        println("$title: $currentPage pages read")
    }

}

class eBook(title: String, author: String, val format: String = "text"): Book(title, author) {

    private var wordsCount = 0

    override fun readPage() {
        wordsCount += 250
        println("$title: $wordsCount words read")
    }

}