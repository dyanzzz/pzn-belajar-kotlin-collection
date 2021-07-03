package app

// 29. ordering
// ordering natural/ automatic ordering
fun main() {
    // 2 macam ordering otomatis
    // sorted()
    // sortedDescending()
    val numbers = listOf(3, 2, 5, 6, 7, 3, 45, 4, 1)
    println(numbers.sorted())
    println(numbers.sortedDescending())
}