package app

fun main() {
    val list = mutableListOf("Dian", "Tri", "Budianto")

    // membuat collection baru/ seperti mengcopy, baru melakukan ordering reversed
    val listReversed = list.reversed()
    // mereference ke list utamanya, jika ada perubahan pada list master listnya,
    // listAsReversed ini akan ikut berubah mengikuti list aslinya
    val listAsReversed = list.asReversed()

    println(listReversed)
    println(listAsReversed)

    list.add("Programmer")

    println(listReversed)
    println(listAsReversed)
}