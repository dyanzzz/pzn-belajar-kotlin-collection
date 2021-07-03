package app

// 40. properties di map
fun main() {
    val map = mapOf(
        "name" to "Belajar kotlin",
        "version" to 2.3
    )

    val app = Application(map)
    println(app.name)
    println(app.version)
}

// agak bingung disini, nanti dipelajari lagi
class Application(map: Map<String, Any>){
    val name: String by map
    val version: Int by map
}