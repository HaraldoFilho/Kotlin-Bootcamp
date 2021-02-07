package lesson6

enum class Direction {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {

    var path = mutableListOf(Direction.START)

    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }

    val end = { path.add(Direction.END); println("Game Over: $path"); path.clear(); false }

    fun move(where: () -> Boolean ) { where() }

    fun makeMove(to: String?) {
        when (to) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> end()
        }
    }

}

fun main(args: Array<String>) {

    val game = Game()

    while (true) {
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }

}