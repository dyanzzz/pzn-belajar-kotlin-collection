package app

fun main() {
    // displayMutableCollection(listOf("budi", "anto"))     // error, bukan turunan mutableCollection
    displayMutableCollection(mutableListOf("budi", "anto")) // tidak error, turunan mutableCollection
    // displayMutableCollection(setOf("budi", "anto"))      // error, bukan turunan mutableCollection
    displayMutableCollection(mutableSetOf("budi", "anto"))
    // displayMutableCollection(mapOf("budi" to "anto"))    // error karena map bukan turunan dari mutableCollection
    //displayMutableCollection(mapOf("budi" to "anto").entries)  // kalo mau display semua data dengan map, tambahkan entries
    displayMutableCollection(mutableMapOf("budi" to "anto").entries)  // kalo mau display semua data dengan map, tambahkan entries
    // karena .entries return nya set yg merupakan turunannya mutableCollection

}

// function generic
fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (item in collection) println(item)
}