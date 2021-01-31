fun main(args: Array<String>) {
    println(whatShouldIDoToday(getMood(), "rainy", 0))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isHappyAndSunny(mood, weather) -> "Go for a walk"
        isHappySunnyAndHot(mood, weather, temperature) -> "Go to the beach"
        isRainyAndCold(weather, temperature) -> "Stay home and watch TV"
        isHappyRainyAndHot(mood, weather, temperature) -> "Go to the movies"
        isBored(mood) -> "Go out with friends"
        isSadRainyAndFreezing(mood, weather, temperature) -> "Stay in bed"
        else -> "Stay home and read."
    }
}

fun isHappyAndSunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun isHappySunnyAndHot(mood: String, weather: String, temperature: Int) = mood == "happy" && weather == "sunny" && temperature >= 30

fun isRainyAndCold(weather: String, temperature: Int) = weather == "rainy" && temperature > 0 && temperature <= 20

fun isHappyRainyAndHot(mood: String, weather: String, temperature: Int) = mood == "happy" && weather == "rainy" && temperature >= 27

fun isBored(mood: String) = mood == "bored"

fun isSadRainyAndFreezing(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature <= 0

fun getMood(): String {
    print("What is your mood today?: ")
    return readLine()!!
}

