package app

fun main() {
    val list = listOf("Dian", "Tri", "Budianto")

    val list1: Map<String, Int> = list.associate { Pair(it, it.length) }
    println(list1)

    // convert map menjadi Map<String, Int> valuenya adalah lambda T dengan => associateWith

    val list2: Map<String, Int> = list.associateWith { it.length }
    println(list2)

    // convert map menjadi Map<Int, String> keynya adalah lambda T dengan => associateBy
    val list3: Map<Int, String> = list.associateBy { it.length }
    println(list3)
}