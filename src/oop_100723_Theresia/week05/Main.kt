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

        println("=== MathHelper Test ===")

        val math = MathHelper()

        println("Luas Persegi: ${math.hitungLuas(4)}")
        println("Luas Persegi Panjang: ${math.hitungLuas(5, 3)}")
        println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

        println("=== Payment System ===")

        val wallet = EWallet("Theresia", 50000.0)
        val card = CreditCard("Theresia", 100000.0)

        val payments: List<PaymentMethod> = listOf(wallet, card)

        for (payment in payments) {

            payment.processPayment(75000.0)

            if (payment is EWallet) {
                payment.topUp(50000.0)
                payment.processPayment(75000.0)
            }

            println()
        }
    }
}