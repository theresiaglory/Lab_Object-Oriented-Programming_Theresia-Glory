package oop_100723_Theresia.week05

class Admin(nama: String) : Pegawai(nama) {

    override fun bekerja() {
        println("$nama sedang mengurus administrasi kampus.")
    }

}
