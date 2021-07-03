package app

import data.Person

// 3. set
// collection yg datanya harus unik dan pasti berurut
// tidak bisa duplikat data

fun main() {
    val set: Set<Person> = setOf(
        Person("Budi"), Person("Anto"),
        Person("Tri"), Person("Eko"), Person("dian")
    )

    println(set.contains(Person("Eko")))
    println(set.size)

    for (person in set) {
        println(person)
    }
}