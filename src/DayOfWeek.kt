import java.util.*

fun main(args: Array<String>) {
    dayOfWeek()
}

fun dayOfWeek() {

    val dayOfWeek = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var dayOfWeekString : String = ""

    println("What day is it today?")

    when (dayOfWeek) {
        1 -> dayOfWeekString = "Sunday"
        2 -> dayOfWeekString = "Monday"
        3 -> dayOfWeekString = "Tuesday"
        4 -> dayOfWeekString = "Wednesday"
        5 -> dayOfWeekString = "Thursday"
        6 -> dayOfWeekString = "Friday"
        7 -> dayOfWeekString = "Saturday"
        else -> dayOfWeekString = "... I don't know!"
    }

    println("Today is $dayOfWeekString")

}