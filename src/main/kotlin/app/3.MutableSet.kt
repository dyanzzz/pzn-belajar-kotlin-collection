package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("Budi"))
    mutableSet.add(Person("Dian"))
    mutableSet.add(Person("Tri"))
    mutableSet.add(Person("Anto"))
    mutableSet.add(Person("Budi"))

    println(mutableSet.size)
    println(mutableSet.contains(Person("anto")))
    println(mutableSet.contains(Person("Anto")))

    for (person in mutableSet) {
        println(person)
    }
}