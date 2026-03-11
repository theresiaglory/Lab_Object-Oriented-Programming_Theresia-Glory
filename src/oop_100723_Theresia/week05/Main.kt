package oop_100723_Theresia.week05

fun main() {

    val daftarPegawai: List<Pegawai> = listOf(
        Dosen("Pak Budi"),
        Admin("Bu Sari")
    )

    for (pegawai in daftarPegawai) {

        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> pegawai.mengajar()
            is Admin -> println("${pegawai.nama} sedang mengelola data mahasiswa.")
        }

        println()
    }
}