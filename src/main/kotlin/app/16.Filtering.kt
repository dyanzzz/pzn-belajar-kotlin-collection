package app

// filtering by predicate
// pada filtering kali ini, data yg tidak masuk kondisi akan dihilangkan
// filter tidak mengubah collection datanya, maka collection data masternya akan tetap aman
// tapi membuat collection baru
fun main() {
    val list1 = listOf("Dian", "Tri", "Budianto")
    val list2 = list1.filter { it.length >= 4 }
    println(list2)

    val list3 = list1.filterIndexed { index, value ->
        //println(value)
        index % 2 == 1
    }
    println(list3)

    val list4: List<Any?> = listOf(null, 1, "budi", 2, "anto", null, 3)
    val listString = list4.filterIsInstance<String>()
    println(listString)

    val listInt = list4.filterIsInstance<Int>()
    println(listInt)

    val listNotNull = list4.filterNotNull()
    println(listNotNull)
}