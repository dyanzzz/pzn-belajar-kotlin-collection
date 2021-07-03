package app

fun main() {
    val list : List<String> = listOf("Dian", "Tri", "Budi", "Anto")
    val set = setOf("Dian", "Tri", "Budi", "Anto")

    // cara manual
    /*
    val temp = mutableListOf<String>()
    for(value in list){
        temp.add(value.uppercase())
    }
    val list2 = temp.toList()
     */

    // bisa menggunakan it / value pada lambda
    val list1: List<String> = list.map { value -> value.uppercase() }
    println(list1)

    val set1 = set.map { value -> value.lowercase() }
    println(set1)

    val list2: List<Int> = list.map { it.length }
    println(list2)

    val list3 = list.mapIndexedNotNull { index, value ->
        if (index % 2 == 0) null
        else value
    }
    println(list3)

    val numbers = (1..20).toList()
    val ganjil = numbers.mapNotNull { value ->
        if (value % 2 == 0) null
        else value
    }
    println(ganjil)

}

