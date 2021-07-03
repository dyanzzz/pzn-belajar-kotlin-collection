package app

// mutable iterable
// perbedaannya hanya bisa meremove data pada saat ini iterasinya
fun main() {
    displayMutableIterable(mutableListOf("Eko", "Budi", "Kurniawan", "Anto"))
    displayMutableIterable(mutableSetOf("Eko", "Budi", "Kurniawan", "Anto"))
}

fun <T> displayMutableIterable(iterable: MutableIterable<T>) {
    // cara kerja for loop lebih ringkas
    // for loop merupakan iterable
    /*
    for (value in iterable){
        println(value)
    }
     */

    // cara kerja for loop lebih detail
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        //iterator.remove()   // menghapus data di iterasi saat ini
        println(value)
    }
}