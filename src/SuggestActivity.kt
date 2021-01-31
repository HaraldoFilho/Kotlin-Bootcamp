fun main(args: Array<String>) {
    println(whatShouldIDoToday("happy"))
}

fun whatShouldIDoToday(mood: String, weather: String = "Sunny", temperature: Int = 24): String {
    return when {
        mood == "happy" && weather == "Sunny" -> "Go for a walk"
        mood == "happy" && weather == "Sunny" && temperature >= 30 -> "Go to the beach"
        weather == "Rainy" && temperature <= 20 -> "Stay home and watch TV"
        mood == "happy" && weather == "Rainy" && temperature >= 27 -> "Go to the movies"
        mood == "bored" -> "Go out with friends"
        else -> "Stay home and read."
    }
}