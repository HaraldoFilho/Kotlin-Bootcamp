fun main(args: Array<String>) {
    for (i in 0..9) {
        var fortune: String = getFortuneCoookie()
        println("Your fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!") break
    }
}

fun getFortuneCoookie():String {

    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )

    print("Enter your birthday: ")

    val birthday: Int = readLine()?.toIntOrNull() ?: 1

    return fortunes[birthday%fortunes.size]

}
