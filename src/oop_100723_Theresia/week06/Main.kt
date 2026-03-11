package oop_100723_Theresia.week06

fun main() {

    println("=== Interface Test ===")

    val bird = Bird("Elang")
    val plane = Airplane("Boeing 737")

    val flyers: List<Flyable> = listOf(bird, plane)

    for (f in flyers) {
        f.fly()
        f.land()
        println()
    }

    println("=== Data Class Test ===")

    val mhs1 = Mahasiswa("100723", "Theresia Glory", "Informatika")
    val mhs2 = Mahasiswa("100724", "Maria", "Informatika")

    println(mhs1)
    println(mhs2)

    val produk1 = Produk("Laptop", 12000000.0, 5)
    val produk2 = produk1.copy(stok = 10)

    println(produk1)
    println(produk2)
}