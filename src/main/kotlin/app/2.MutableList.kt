package app

fun main() {
    // kebalikan dari list
    // list bersifat mutable => bisa dirubah
    // bisa dimasukan data terlebih dulu ataupun tidak
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("budi")
    mutableList.add("anto")
    mutableList.add(1, "tri")

    mutableList.set(2, "trianto")   // untuk edit datanya
    mutableList[2] = "budianto"   // untuk edit datanya

    for (value in mutableList){
        println(value)
    }
}