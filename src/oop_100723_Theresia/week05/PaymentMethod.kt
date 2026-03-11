package oop_100723_Theresia.week05

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)

}