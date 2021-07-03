package app

// semua data collection merupakan turunan dari interface collection
// collection digunakan sebagai general operation trhdp struktur data collection,
    // seperti membaca & menulis data di collection
// collection immutable => tidak bisa diubah
fun main() {
    displayCollection(listOf("budi", "anto"))
    displayMutableCollection(mutableListOf("budi", "anto"))
    displayCollection(setOf("budi", "anto"))
    displayMutableCollection(mutableSetOf("budi", "anto"))
    // displayCollection(mapOf("budi" to "anto"))  // error karena map bukan turunan dari collection
    displayCollection(mapOf("budi" to "anto").entries)  // kalo mau display semua data dengan map, tambahkan entries
        // karena .entries return nya set yg merupakan turunannya collection
}

// function generic
fun <T> displayCollection(collection: Collection<T>){
    for (item in collection) println(item)
}