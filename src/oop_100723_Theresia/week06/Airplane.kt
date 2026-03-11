package oop_100723_Theresia.week06

class Airplane(val model: String) : Flyable {

    override fun fly() {
        println("Pesawat $model sedang terbang di udara.")
    }

}