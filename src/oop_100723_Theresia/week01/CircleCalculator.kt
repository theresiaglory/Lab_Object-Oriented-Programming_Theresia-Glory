package oop_100723_Theresia.week01

fun main() {

    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius")
    println("Area: $area")

    println(checkSize(area))
}

fun checkSize(area: Double): String {
    return if (area > 100)
        "This is a Big Circle"
    else
        "This is a Small Circle"
    println("Circle calculation complete")
}