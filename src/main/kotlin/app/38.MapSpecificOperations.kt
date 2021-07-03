package app

fun main() {
    val map = mapOf(
        "a" to "Dian",
        "b" to "Tri",
        "c" to "Budianto"
    )

    println(map.get("zz"))  // kalo ga ada, akan return null
    println(map.getValue("a"))  // kalo ga ada, akan throw exception/ error
    println(map.getOrElse("d"){ "Tidak ada datanya" })  // cek key d, kalo ga ada tampilkan yg didalam lambda\'
    println(map.filter { (key, value) ->    // lambda, bisa di destructuring (key, value)
        value.length > 3    // kalo ada tampilkan
    })
    println(map.filterKeys { key ->
        key > "b"   // cek jika ada key yg lebih besar dari b, kalo ada tampilkan
    })
    println(map.filterValues { value ->
        value.length > 3    // cek length value jika diatas 3, kalo ada tampilkan
    })
}