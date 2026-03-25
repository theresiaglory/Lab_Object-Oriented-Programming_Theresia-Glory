package oop_100723_Theresia.week07

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
}