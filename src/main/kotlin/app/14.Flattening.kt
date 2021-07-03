package app

// 14. flatten
// membuat list yg terpisah pisah menjadi 1 listof
fun main() {
    val list: List<List<String>> = listOf(
        listOf("Budi", "Tri", "Anto"),
        listOf("Budi", "Tri", "Anto"),
        listOf("Budi", "Tri", "Anto")
    )

    val listString: List<String> = list.flatten()
    println(listString)

    val members: List<Member> = listOf(
        Member("Budi", listOf("Reading", "Coding")),
        Member("Eko", listOf("Writing", "Drawing"))
    )
    //val hobies = members.map { it.hobies }.flatten()
    // bisa juga seperti ini, langsung menggunakan flatmap
    val hobies = members.flatMap { it.hobies }
    println(hobies)
}

class Member(val name: String, val hobies: List<String>)