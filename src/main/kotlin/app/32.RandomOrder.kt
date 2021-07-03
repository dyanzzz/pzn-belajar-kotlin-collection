package app

// 32. random order
// untuk mengacak" list yg di define
// tidak mengubah list aslinya, namun membuat collection baru
fun main() {
    val numbers = (1..10).toList()
    println(numbers.shuffled())
    println(numbers.shuffled())
    println(numbers.shuffled())
    println(numbers)
}