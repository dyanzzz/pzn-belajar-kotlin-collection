package app

// 36. list specific operation
fun main() {
    // getOrElse(index, (index) -> T (lambda)   => mengambil element di index, jika tidak ada, ambil pada lambdanya
    // getOrNull(index)
    // subList(from, to)    => mengambil data dari index from sampai index ke to
    // binarySearch(value)  => pencarian binary search (datanya harus berurut)

    val list = listOf("Dian", "Tri", "Budianto")

    println(list.get(1))
    println(list.getOrNull(10))
    println(list.getOrElse(10) { index -> "Tidak ada" })
    println(list.subList(0, 2)) // mengambil data from index 0 sampai/to urutan ke 2

    val sortedList = list.sorted()
    println(sortedList)
    println(sortedList.binarySearch("Dian"))        // get index
    println(sortedList.binarySearch("Tri"))         // get index
    println(sortedList.binarySearch("Budianto"))    // get index

    println()
    val numbers = listOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 6)
    println(numbers.indexOf(2))
    println(numbers.lastIndexOf(2))
    println(numbers.indexOfFirst { it > 3 })    // 6 => karena 4 berada pada index ke 6
    println(numbers.indexOfLast { it > 3 })     // 11 => karena 6 berada pada index ke 11
}