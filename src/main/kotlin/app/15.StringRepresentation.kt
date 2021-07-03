package app

import java.lang.StringBuilder

// 15. String representation
// trasformasi mengubah collection list menjadi sebuat string
fun main() {
    val list = listOf("Dian", "Tri", "Budi", "Anto")

    // menggabungkan list
    // defaultnya separatornya ,(coma)
    // awalan(prefix) dan akhirannya(postfix) string kosong
    val string1 = list.joinToString(" ", "|", "|")
    println(string1)

    // menggabungkan list
    val string2 = list.joinToString(" ", "|", "|"){ it.uppercase() }
    println(string2)

    // menggabungkan list kedalam stringBuilder
    // string builder akan membuat string baru
    val builder = StringBuilder()
    list.joinTo(builder," ", "|", "|")
    list.joinTo(builder," ", "<", ">")
    list.joinTo(builder," ", "-", "-")
    val string3 = builder.toString()
    println(string3)

    // convert dari range to list
    // menggabungkan list yg sudah di convert menjadi string
    val numbers: List<Int> = (1..10).toList()
    println(numbers.joinToString())

}