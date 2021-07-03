package app

// 22. take and drop
// take => ambil data
// drop => hapuis data
// untuk mengambil element di collection, selain menggunakan slice, bisa juga menggunakan take and drop
fun main() {
    // take(n) => mengambil collection diawal sejumlah n
    // takeLast(n) => mengambil collection dari akhir sejumlah n
    // takeWhile((T) -> Boolean)    => mengambil kondisi dari awal selama kondisinya true, jika false, maka berhenti
    // takeWhileLast((T) -> Boolean)    => mengambil kondisi dari akhir selama kondisinya true, jika false, maka berhenti

    // drop(n) => menghapus collection diawal sejumlah n
    // dropLast(n) => menghapus collection dari akhir sejumlah n
    // dropWhile((T) -> Boolean)    => menghapus kondisi dari awal selama kondisinya true, jika false, maka berhenti
    // dropWhileLast((T) -> Boolean)    => menghapus kondisi dari akhir selama kondisinya true, jika false, maka berhenti

    val chars: List<Char> = ('a'..'z').toList()

    println(chars.take(3))  // ambil 3 huruf dari depan list
    println(chars.takeLast(3))  // ambil 3 huruf dari belakang list
    println(chars.takeWhile { it < 'f' })   // looping huruf sampai 'f', kemudian tampilkan
    println(chars.takeLastWhile { it > 'w' })   // looping huruf dari belakang/'z' sampai diatas 'w'

    println()

    println(chars.drop(3))
    println(chars.dropLast(3))
    println(chars.dropWhile { it < 'f' })
    println(chars.dropLastWhile { it > 'w' })
}