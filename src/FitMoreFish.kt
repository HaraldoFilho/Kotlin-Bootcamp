fun main(args: Array<String>) {
    println(testCanAddFish(canAddFish(10.0, listOf(3,3,3)), false))
    println(testCanAddFish(canAddFish(8.0, listOf(2,2,2), hasDecorations = false), true))
    println(testCanAddFish(canAddFish(9.0, listOf(1,1,3), 3), false))
    println(testCanAddFish(canAddFish(10.0, listOf(), 7, true), true))
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {

    val tankAvailableGallons = if (hasDecorations) tankSize*0.8 else tankSize
    var currentFishTotal = 0

    for (fish in currentFish) {
        currentFishTotal += fish
    }

    currentFishTotal += fishSize

    return currentFishTotal <= tankAvailableGallons

}

fun testCanAddFish(functionResult: Boolean, expectedResult: Boolean): String {
    return if (functionResult == expectedResult) "PASS" else "FAIL"
}