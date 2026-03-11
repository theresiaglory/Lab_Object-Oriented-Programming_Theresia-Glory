package oop_100723_Theresia.week04

fun main() {

    println("=== Vehicle Test ===")
    val generalVehicle = Vehicle("Generic Vehicle")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println()

    val myCar = Car("Toyota", 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println()

    val myElectricCar = ElectricCar("Tesla", 4, 100)
    myElectricCar.openTrunk()
    myElectricCar.honk()
    myElectricCar.accelerate()

    println("\n=== Employee Test ===")

    val manager = Manager("Budi", 10000000)
    manager.work()
    println("Bonus Manager: ${manager.calculateBonus()}")

    println()

    val developer = Developer("Sinta", 8000000, "Kotlin")
    developer.work()
    println("Bonus Developer: ${developer.calculateBonus()}")
}