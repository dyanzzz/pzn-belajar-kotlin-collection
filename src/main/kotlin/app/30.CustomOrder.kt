package app

import data.Fruit

// 30. Custom Order
// cocok untuk mengurutkan data yg kita buat sendiri
fun main() {
    // sortedBy(selector: (T) -> R) => mengurutkan colection ascending menggunakan selector
    // sortedByDescending(selector: (T) -> R) => mengurutkan colection descending menggunakan selector
    // sortedWith(Comparator<T>)    => menggunakan collection dengan comparator

    val fruits = listOf(
        Fruit("apple", 10),
        Fruit("orange", 5),
        Fruit("banana", 4)
    )
    println(fruits.sortedBy { it.quantity })
    println(fruits.sortedByDescending { it.quantity })

    // custom order menggunakan extension function bawaan kotlin
    println(fruits.sortedWith(compareBy { it.quantity }))
    println(fruits.sortedWith(compareByDescending { it.quantity }))

    // custom order manual banget
    println(fruits.sortedWith(Comparator { a, b ->
        a.quantity.compareTo(b.quantity)
    }))
}