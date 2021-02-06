package lesson5.Buildings

fun main(args: Array<String>) {

    val woodBuilding = Building(Wood())
    woodBuilding.build()
    isSmallBuilding(woodBuilding)

    val brickBuilding = Building(Brick())
    brickBuilding.build()
    isSmallBuilding(brickBuilding)

}

open class BaseBuildingMaterial {
    open val numberNeeded = 1
}

class Wood: BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick: BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<out T: BaseBuildingMaterial>(private val material: T) {

    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("The build will require $actualMaterialsNeeded ${material::class.simpleName}")
    }

}

fun <T: BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) println("It is a small building") else println("It is a large building")
}


