package oop_2602071234_Theresia.week01

fun main() {

    val score = 85

    val grade = when {
        score >= 85 -> "A"
        score >= 70 -> "B"
        score >= 60 -> "C"
        score >= 50 -> "D"
        else -> "E"
    }

    println("Score: $score")
    println("Grade: $grade")
}