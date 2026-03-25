package oop_100723_Theresia.week07

data class Mahasiswa(
    val nama: String,
    val nilai: Int
)

fun operasi(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {

    println("=== List & Lambda ===")

    val mahasiswa = listOf(
        Mahasiswa("Theresia", 85),
        Mahasiswa("Maria", 70),
        Mahasiswa("Budi", 90),
        Mahasiswa("Andi", 60)
    )

    val lulus = mahasiswa.filter { it.nilai >= 75 }

    println("Mahasiswa Lulus:")
    lulus.forEach {
        println("${it.nama} - ${it.nilai}")
    }

    println()

    val namaSaja = mahasiswa.map { it.nama }

    println("Daftar Nama:")
    namaSaja.forEach { println(it) }

    // =========================

    println("\n=== Mutable List ===")

    val angka = mutableListOf(1, 2, 3)

    angka.add(4)
    angka.remove(2)

    println(angka)

    // =========================

    println("\n=== Set ===")

    val angkaSet = setOf(1, 2, 2, 3, 4, 4)

    println("Isi set: $angkaSet")

    // =========================

    println("\n=== Map ===")

    val nilaiMap = mapOf(
        "Theresia" to 85,
        "Maria" to 70
    )

    for ((nama, nilai) in nilaiMap) {
        println("$nama -> $nilai")
    }

    // =========================

    println("\n=== Sorting ===")

    val sorted = mahasiswa.sortedByDescending { it.nilai }

    sorted.forEach {
        println("${it.nama} - ${it.nilai}")
    }

    // =========================

    println("\n=== Higher Order Function ===")

    val hasil = operasi(5, 3) { x, y -> x + y }

    println("Hasil: $hasil")
}