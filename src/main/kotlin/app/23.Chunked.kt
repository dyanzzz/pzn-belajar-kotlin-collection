package app

// 23. chunked
// memotong collection menjadi beberapa collection
fun main() {
    val numbers = (1..100).toList()

    val list1 = numbers.chunked(10)
    println(list1)
    println(list1.size)

    //val list2 = numbers.chunked(10).map { values ->
    // chunked mempunyai function lambda sendiri agar dapat langsung di mapping, tanpa harus memanggil map terlebih dulu
    val list2 = numbers.chunked(10) { values ->
        var total = 0
        for (value in values) {
            total += value
        }
        total
    }
    println(list2)


}