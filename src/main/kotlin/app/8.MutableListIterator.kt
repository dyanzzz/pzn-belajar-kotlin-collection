package app

fun main() {
    val mutablList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    removeOddNumber(mutablList.listIterator())
    displayMutableListIterator(mutablList.listIterator())
}

fun <T> displayMutableListIterator(mutableListIterator: MutableListIterator<T>) {
    while (mutableListIterator.hasNext()){
        println(mutableListIterator.next())
    }
}

fun removeOddNumber(mutableListIterator: MutableListIterator<Int>) {
    while (mutableListIterator.hasNext()) {
        val value = mutableListIterator.next()
        if (value % 2 == 1) mutableListIterator.remove()
    }
}