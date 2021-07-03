package app

// 26. retrieve by condition
fun main() {
    val range = (1..20).toList()

    // penting
    // khusus untuk .first & .last => jangan sampai data list null/ tidak ada/tidak sesuai
    // akan mengakibatkan throw exception
    // untuk amannya gunakan firstOrNull
    println(range.first { it > 10 })    // 11 => ambil dari list yg diatas 10 (yg pertama diatas 10)
    println(range.last { it > 10 })     // 20 => ambil dari list terakhir yg diatas 10 (yg pertama diatas 10)

    println(range.firstOrNull { it > 50 }) // null => ambil dari list yg diatas 10 (return value/null jika tidak ada isinya)
    println(range.lastOrNull { it > 50 }) // null => ambil dari list terakhir yg diatas 10 (return value/null jika tidak ada isinya)
    println(range.find { it > 50 }) // null => cari dari list yg diatas 10 (return value/null jika tidak ada isinya)
    println(range.findLast { it > 50 }) // null => cari dari list terakhir yg diatas 10 (return value/null jika tidak ada isinya)

}