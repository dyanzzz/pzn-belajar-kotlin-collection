package app

//
fun main() {
    // forEach merupakan extension function dari itterable
    // karena dari iterable, maka list, set bisa menggunakan forEach
    listOf("dian", "tri", "budianto").forEach { value ->
        println(value)
    }

    mutableListOf("dian", "tri", "budianto").forEachIndexed { index, value ->
        println("$index : $value")
    }

    println("menggunana mutablesetof")
    mutableSetOf("dian", "tri", "budianto").forEachIndexed{ index, value ->
        println("$index : $value")
    }
}