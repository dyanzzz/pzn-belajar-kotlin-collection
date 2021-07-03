package app

// 19. plus & minus operators
// parameter 1 collection
// parameter 2 bisa collection/ element
// akan membentuk collection baru setelah diterapkan
fun main() {
    val list: List<String> = listOf("Dian", "Tri", "Budi", "Anto")

    val list1 = list.plus("Programmer")
    val list2 = list + "Zaman Now"
    val list3 = list + listOf("Java", "Kotlin")
    val list4 = list - "Tri"
    val list5 = list - listOf("Dian", "Tri")

    println(list1)
    println(list2)
    println(list3)
    println(list4)
    println(list5)

    println()

    // bisa juga menggunakan map
    // jika plus, plus dengan pair
    // jika minus, minus dengan key
    val map = mapOf(
        "a" to "Budi",
        "b" to "Dian"
    )
    val map1 = map.plus("c" to " Tri")
    val map2 = map + ("d" to " Anto")
    val map3 = map - "a"
    println(map1)
    println(map2)
    println(map3)
}