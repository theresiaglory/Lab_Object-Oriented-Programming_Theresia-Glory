package oop_100723_Theresia.week03

class Book(
    var title: String,
    var author: String,
    var year: Int
) {

    fun displayInfo() {
        println("Title: $title")
        println("Author: $author")
        println("Year: $year")
    }

}