package app

// 35 grouping interface
// eachCount()  => menghitung jumlah data pad tiap groupnya
// reduce() & fold()    => melakukan operasi reduce & fold pada tiap group
// agregate(key: K, accumulator: R?, element: T, first: Boolean) =>
fun main() {
    val list = listOf("a", "a", "b", "b", "c", "c", "c", "d")
    val grouping: Grouping<String, String> = list.groupingBy { it }

    println(grouping.eachCount())   // menghitung jumlah total pada masing" groupnya

    val fold = grouping.fold(""){ first, second ->
        first + second
    }
    println(fold)

    val reduce = grouping.reduce{ key, first, second ->
        first + second
    }
    println(reduce)

    val aggregate = grouping.aggregate { key, first: String?, second, isFirst ->
        if (isFirst) second
        else first + second
    }
    println(aggregate)
}