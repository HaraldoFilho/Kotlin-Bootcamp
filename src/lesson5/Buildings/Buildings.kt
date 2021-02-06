package lesson5.Buildings

fun main(args: Array<String>) {
    Building(Wood()).build()
}

open class BaseBuildingMaterial() {
    open val numberNeeded = 1
}

class Wood(): BaseBuildingMaterial() {
    override val numberNeeded = 4
}

class Brick(): BaseBuildingMaterial() {
    override val numberNeeded = 8
}

class Building<T: BaseBuildingMaterial>(private val material: T) {

    private val baseMaterialsNeeded = 100
    private val actualMaterialsNeeded = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("The build will require $actualMaterialsNeeded ${material::class.simpleName}")
    }

}