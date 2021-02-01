package lesson3

fun main(args: Array<String>) {
    println ( if (args[0].toInt() < 12) "Good morning Kotlin!" else "Good afternoon Kotlin!" )
}