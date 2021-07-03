package app

// 37. set specific operations
// harus unik datanya
// menggabungkan 2 setOf / collection
// fokusnya ke membandingkan set 1 dengan set yg lain
fun main() {
    val set1 = (1..10).toSet()
    val set2 = (6..15).toSet()

    println(set1.union(set2))       // tanpa data yg sama/uniq

    // yg beririsan
    println(set1.intersect(set2))   // hanya mengembalikan data set collection yg sama aja

    println(set1.subtract(set2))    // hanya mengembalikan data set collection yg berbeda aja
    println(set2.subtract(set1))    // hanya mengembalikan data set collection yg berbeda aja
}