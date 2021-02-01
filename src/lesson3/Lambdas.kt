package lesson3

import kotlin.random.Random

fun main(args: Array<String>) {

    val rollDice = { sides: Int -> if (sides > 0) Random.nextInt(1, sides+1) else 0 }
    println(rollDice(12))
    println(rollDice(1))
    println(rollDice(0))

    val rollDice2: (Int) -> Int = { sides -> if (sides > 0) Random.nextInt(1, sides+1) else 0 }

    gamePlay(12, rollDice2)
    gamePlay(1, rollDice2)
    gamePlay(0, rollDice2)

}

fun gamePlay(sides: Int, dice: (Int) -> Int) {
    println(dice(sides))
}
