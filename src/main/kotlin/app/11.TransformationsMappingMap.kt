package app

fun main() {
    val map : Map<Int, String> = mapOf(
        1 to "Dyan",
        2 to "Tri",
        3 to "Budi",
        4 to "Anto"
    )

    val mapKeys = map.mapKeys {
        it.key * 10
    }
    println(mapKeys)

    val mapValues = map.mapValues {
        it.value.uppercase()
    }
    println(mapValues)

}

