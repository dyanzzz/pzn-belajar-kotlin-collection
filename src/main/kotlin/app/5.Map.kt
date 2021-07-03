package app

import data.Person

// 5. map
// merupakan collection yg berbentuk (key, value), dan key disini berperan sebagai index
// keynya harus unik, jika ada key yg sama, maka data sebelumnya akan di replace dengan data yg baru
// tipe data key dapat menggunakan tipe data apapun sesuai yg kita inginkan
fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Budi"),
        "b" to "Anto",
        "c" to "Naira",
        "d" to "Jen"
    )

    println(map.keys)   // kembaliannya set karena unik
    println(map.values) // kembaliannya collection<string> akrena boleh duplikat
    println(map.entries)

    // bisa menggunakan entries, bisa juga tidak
    // bisa didestructuring
    for ((key, value) in map.entries) {
        println("key : $key to value : $value")
    }
}