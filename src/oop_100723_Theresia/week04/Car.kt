package oop_100723_Theresia.week04

open class Car(
    brand: String,
    val numberOfDoors: Int
) : Vehicle(brand) {

    fun openTrunk() {
        println("$brand membuka bagasi.")
    }

    override fun honk() {
        println("$brand berbunyi: Honk honk!")
    }

    override fun accelerate() {
        super.accelerate()
        println("$brand mempercepat mobil dengan mesin bensin.")
    }
}