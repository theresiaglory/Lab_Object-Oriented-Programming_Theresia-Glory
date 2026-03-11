package oop_100723_Theresia.week01

fun main() {

    val gameName = "Minecraft"
    val price = 300000
    val discount = 0.2

    val finalPrice = price - (price * discount)

    println("Game: $gameName")
    println("Original Price: $price")
    println("Discounted Price: $finalPrice")
}