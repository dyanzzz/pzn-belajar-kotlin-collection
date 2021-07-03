package app

// filtering testing
// returnnya boolean
fun main() {
    val list: List<String> = listOf("Dian", "Tri", "Budianto")

    // jika ada data yg lebih dari 3
    println(list.any { it.length > 3 })

    // jika tidak ada data yg lebih dari 3
    println(list.none { it.length > 3 })

    // jika semua datanya lebih dari 3
    println(list.all { it.length > 3 })

    // jika list memiliki data
    println(list.any())

    // jika list tidak memiliki data, sama seperti isEmpty
    println(list.none())
}