package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()

    mutableMap["a"] = "Budi"
    mutableMap.put("b", "asd")
    mutableMap["c"] = "Mobil"

    println(mutableMap["a"])
    println(mutableMap.get("a"))
    println(mutableMap.getOrDefault("d", "Data ga ada"))    // kalo datanya ga ada, hasilnya "data ga ada"
    println(mutableMap["d"])    // kalo ga ada datanya, maka hasilnya null

    mutableMap.remove("b")

    for ((key, value) in mutableMap){
        println("key : $key to value : $value")
    }
}