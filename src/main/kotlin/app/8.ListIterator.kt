package app

fun main() {
    displayListIterator(listOf("dian", "tri", "budi", "anto").listIterator())
}

fun <T> displayListIterator(listIterator: ListIterator<T>) {
    println("display next")
    while (listIterator.hasNext()){
        println(listIterator.next())
    }

    println("display previous")
    while (listIterator.hasPrevious()){
        println(listIterator.previous())
    }
}