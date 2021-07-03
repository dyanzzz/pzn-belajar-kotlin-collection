package app

fun main() {
    val list: List<Pair<String, String>> = listOf(
        "Dian" to "Programmer",
        "Tri" to "Zaman",
        "Budi" to "Now"
    )

    val pair: Pair<List<String>, List<String>> = list.unzip()
    println(pair.first)
    println(pair.second)
    // bisa juga langsung di destructuring. tanpa mendefinisikan tipe data Pair tsb
    val (list1, list2) = list.unzip()
    println(list1)
    println(list2)
}