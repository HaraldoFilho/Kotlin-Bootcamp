package lesson3

import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {

    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println("What day is it today?")

    val dayOfWeekString = when (dayOfWeek) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "... I don't know!"
    }

    println("Today is $dayOfWeekString")

}