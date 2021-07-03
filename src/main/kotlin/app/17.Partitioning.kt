package app

// filtering partitioning
// pada filtering by predicate, kita akan menghilangkan data yg tidak masuk kondisi filter
// namun pada filtering partitioning, kita akn membagi collection menjadi 2
// 1 untuk kondisi yg masuk filtering
// 2 untuk kondisi yg tidak masuk filtering
fun main() {
    val list: List<String> = listOf("Dian", "Tri", "Budianto")
    // val listPartition: Pair<List<String>, List<String>> = list.partition { it.length > 3 }
    val (listMatch, listNotMatch) = list.partition { it.length > 3 }
    println(listMatch)
    println(listNotMatch)
}