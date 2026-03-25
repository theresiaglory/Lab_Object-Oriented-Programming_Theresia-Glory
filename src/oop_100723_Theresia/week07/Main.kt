package oop_2602071234_Theresia.week01.oop_100723_Theresia.week07

package oop_<nim>_<nama>.week07

fun main() {

    // STEP 6 (regular class)
    val u1 = User("Alex", 20)
    val u2 = User("Alex", 20)

    println(u1)
    println(u2)
    println(u1 == u2) // false

    println("-----")

    // STEP 7 (data class)
    val d1 = UserData("Alex", 20)
    val d2 = UserData("Alex", 20)

    println(d1)
    println(d2)
    println(d1 == d2) // true
}