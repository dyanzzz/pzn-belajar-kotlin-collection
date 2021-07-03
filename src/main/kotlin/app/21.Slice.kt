package app

// 21. slice
// mengambil sebagian element yg ada di collection sesuai dengan parameter INDEX range
// slice(range)
fun main() {
    val list: List<Int> = (1..50).toList()
    println(list)

    val list1 = list.slice(0..20)
    println(list1)

    val list2 = list.slice(0..20 step 2)
    println(list2)

    val list3 = list.slice(30 downTo 0 step 2)
    println(list3)
}