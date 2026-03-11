package oop_100723_Theresia.week06

class Bird(val name: String) : Flyable {

    override fun fly() {
        println("$name sedang terbang di langit.")
    }

}
