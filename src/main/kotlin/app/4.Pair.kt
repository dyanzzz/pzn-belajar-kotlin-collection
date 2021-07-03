package app

// 4. pair
// representasi dari data yg berpasangan
// di map, pair digunakan sebagai data map ketika pertama kali map dibuat
fun main() {
    val pair1: Pair<String, String> = Pair("Budi", "Tri")
    println(pair1.first)
    println(pair1.second)

    val pair2: Pair<String, String> = "Budi" to "Anti"
    println(pair2.first)
    println(pair2.second)
}