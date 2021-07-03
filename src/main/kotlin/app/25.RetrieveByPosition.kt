package app

// 25. retrieve single element by position
fun main() {
    val list = listOf("Dian", "Tri", "Budi", "Anto")
    println(list.elementAt(1))
    println(list.first())
    println(list.last())
    println(list.elementAtOrNull(30))
    println(list.elementAtOrElse(20, ){ "Kosong" }) // default value didalam lambda

    println()

    val set = setOf("Dian", "Tri", "Budi", "Anto")
    println(set.elementAt(2))   // pada function dasarnya, elementAt melakukan looping untuk menemukan n/index ke n
    println(set.first())
    println(set.last())
    println(set.elementAtOrNull(30))
    println(set.elementAtOrNull(3))
    println(set.elementAtOrElse(20) { "Kosong" })
}