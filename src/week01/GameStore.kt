package oop_2602071234_Theresia.week01

fun main() {

    val gameTitle = "Elden Ring"
    val price = 650000

    val finalPrice = calculateDiscount(price)

    printReceipt(gameTitle, finalPrice)
}

fun calculateDiscount(price: Int): Int {

    return if (price > 500000)
        price - (price * 20 / 100)
    else
        price - (price * 10 / 100)
}

fun printReceipt(title: String, finalPrice: Int) {

    val userNote: String? = null

    println("Game: $title")
    println("Final Price: Rp $finalPrice")
    println("Note: ${userNote ?: "Tidak ada catatan"}")
}