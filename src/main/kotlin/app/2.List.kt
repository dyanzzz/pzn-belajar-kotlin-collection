package app

// 2. list
// list => collection yg datanya seperti array
// menggunakan index untuk mengambil data
// tipe datanya harus sama seperti yg di definisikan diawal. (karena java & kotlin adalah tipe pemrogramman statis)
// perbedaannya dengan array
    // array itu statis, ukurannya fix
    // list itu dinamis, ukurannya bisa ditambahkan sebanyak"nya (jika jenisnya mutableList)
fun main() {
    // list bersifat immutable => tidak bisa dirubah
    // hanya bisa read data list aja
    val list: List<String> = listOf("Dian", "tri", "budianto")

    println(list[0])
    println(list.get(1))

    println(list.indexOf("Dian"))
    println(list.indexOf("tri"))

    println(list.contains("Dian"))

    println(list.containsAll(listOf("Dian", "tri")))

    println(list.isEmpty())
    println(list.isNotEmpty())
}