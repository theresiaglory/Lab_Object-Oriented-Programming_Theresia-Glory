package oop_2602071234_Theresia.week01.oop_100723_Theresia.week07

class NetworkClient private constructor(val baseUrl: String) {

    companion object {
        fun create(baseUrl: String): NetworkClient {
            return NetworkClient(baseUrl)
        }
    }
}