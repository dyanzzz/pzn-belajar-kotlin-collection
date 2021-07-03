package app

// 39. sequence
// selain list, set, & map. kotlin juga memiliki collection yg bernama sequence
// pada collection lain, ketika kita menambahkan beberapa operasi, semua akan dieksekusi secara eager/langsung. dan setiap proses akan membuat collection baru
// berbeda pada sequence, sequence mengeksekusi semua operasi secara lazy. hanya akan dieksekusi ketika dibutuhkan.

// kapan menggunakan sequence
    // ketika data collection besar
    // operasi collection yang compleks dan banyak
// jangan gunakan sequence  ketika :
    // data collection yg tidak terlalu banyak, karena ada overhead lazy di sequence. sequence itu akan ditumpuk" pada sequence
    // operasi yg dilakukan sederhana
fun main() {
    // contoh yg tidak menggunakan sequence
    // akan melakukan filter pada seluruh element list yg ada
    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val result = words
        .filter {
            println("filter $it")
            it.length > 3   // filter ini akan mengambil kata.length diatas 3 (dapet 5 kata)
        }
        .map {
            println("map $it")
            it.uppercase()  // map merubah it/ value tsb menjadi uppercase
        }
        .take(3)    // take berguna untuk mengambil hanya 3 kata dari 5 kata yg dimiliki dari hasil filter

    println(result)

    println()
    println("============================")
    println()

    // jika sudah mncapai take(3) yg kita mau, maka dia akan berhenti, tidak melanjutkan filter ke semua element pada list
    val sequence = words.asSequence()
    val resultSequence = sequence
        .filter {
            println("filter $it")
            it.length > 3   // filter ini akan mengambil kata.length diatas 3 (dapet 5 kata)
        }
        .map {
            println("map $it")
            it.uppercase()  // map merubah it/ value tsb menjadi uppercase
        }
        .take(3)    // take berguna untuk mengambil hanya 3 kata dari 5 kata yg dimiliki dari hasil filter

    println(resultSequence.toList())


}