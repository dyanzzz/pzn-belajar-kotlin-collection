package app

// operasi untuk menggroupkan element-element yg ada di collection
// operasi dengan groupBy dan menjadi map dan return key
// operasi dengan groupingBy dan menjadi grounping dan return key
fun main() {
    val list = listOf("a", "b", "a", "a", "c", "b", "z", "d", "c", "ab", "ab", "ac", "ad")

    // filter by duplicate, menggabungkan list berdasarkan data yg sama/duplicate
    val map1: Map<String, List<String>> = list.groupBy { it }
    println(map1)

    // filter by length, menggabungkan list berdasarkan panjang/length value stringnya
    val map2: Map<Int, List<String>> = list.groupBy { value -> value.length }
    println(map2)

    // grouping contoh singkat
    val grouping: Grouping<String, String> = list.groupingBy { it }
    // function toString belum di convert, nanti akan di overide di course berikutnya
    println(grouping.toString())
}