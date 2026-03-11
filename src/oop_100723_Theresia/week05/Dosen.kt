package oop_100723_Theresia.week05

class Dosen(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengajar di kelas.")
    }

    fun mengajar() {
        println("$nama menjelaskan materi kepada mahasiswa.")
    }
}