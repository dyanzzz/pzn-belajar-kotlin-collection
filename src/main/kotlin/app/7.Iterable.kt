package app

// iterable merupakan superclass dari collection interface
fun main() {
    displayIterable(listOf("Eko", "Budi", "Kurniawan", "Anto"))
    displayIterable(setOf("Eko", "Budi", "Kurniawan", "Anto"))
}

fun <T> displayIterable(iterable: Iterable<T>) {
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
        println(value)
    }
}