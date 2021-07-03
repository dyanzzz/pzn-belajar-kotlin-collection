package app

// konversi collection
fun main() {
    val array = arrayOf(3,2,5,7,8,9,45,2,3,4,6,7,34)
    val range = 1..100
    /*for (value in array) {
        println(value)
    }*/
    println(array.size)

    val list = array.toList()
    val set = array.toSet()
    println(list.size)
    println(set.size)

    val mutableList = range.toMutableList()
    val mutableSet = range.toMutableSet()
    println(mutableList)
    println(mutableSet)

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()
    println(listToMutableList)
    println(setToMutableSet)

    val sortedSet = array.toSortedSet()
    println(sortedSet)
}