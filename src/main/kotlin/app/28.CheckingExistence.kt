package app

// mengecek apakah dalam collection terdapat data yg kita cari atau tidak
fun main() {
    // contains(element): Boolean   => mengecek kata
    // containsAll(Collection<T>): Boolean
    // isEmpty(): Boolean
    // isNotEmpty(): Boolean

    // bisa menggunakan set/list
    //val range = (1..10).toSet()
    val range = (1..10).toList()
    println(range.contains(3))
    println(range.containsAll(listOf(3, 4, 58)))    // semua data harus ada didalam list range, jika salah 1 ada yg tidak ada, maka data akan false
    println(range.isEmpty())
    println(range.isNotEmpty())
}