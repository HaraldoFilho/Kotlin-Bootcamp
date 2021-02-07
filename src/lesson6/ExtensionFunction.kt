package lesson6

fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)
    val divisor = 3
    println(numbers.areDivisibleBy { it % divisor })
}

fun List<Int>.areDivisibleBy(block: (Int) -> Int): List<Int> {
    val returnList = mutableListOf<Int>()
    for (i in this) if (block(i) == 0) returnList.add(i)
    return returnList
}