fun main(args: Array<String>) {

    var fortune = ""
    var i = 0

    while(!fortune.contains("Take it easy") && i < 10) {
        fortune = getFortune()
        println("Your fortune is: $fortune")
        i++
    }

}

fun getFortune(): String {

    val fortunes = listOf(
            "You will have a great day!",
            "Things will go well for you today.",
            "Enjoy a wonderful day of success.",
            "Be humble and all will turn out well.",
            "Today is a good day for exercising restraint.",
            "Take it easy and enjoy life!",
            "Treasure your friends because they are your greatest fortune."
    )

    val birthday = getBirthday()

    return when (birthday) {
        28, 31 -> "Take your time!"
        in 1..7 -> "Have a nice month!"
        else -> fortunes[birthday % fortunes.size]
    }

}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}
