package app

fun main() {
    val map = mapOf(
        "a" to "dian",
        "b" to "tri",
        "c" to "budianto"
    )

    for (entry in map) {
        println("${entry.key} : ${entry.value}")
    }

    println()
    for ((key, value) in map) {
        println("$key : $value")
    }

    println()
    map.forEach{ entry ->
        println("${entry.component1()} : ${entry.component2()}")
    }

    println()
    map.forEach{ (key, value) ->
        println("$key : $value")
    }
}