package oop_100723_Theresia.week03

class Person(
    var name: String,
    var age: Int
) {

    fun introduce() {
        println("My name is $name")
        println("I am $age years old")
    }

}