package app

// 34. fold and reduce
// operasi yg dilakukan pada tiap element di collection secara iterasi sequential dan mengambil hasilnya
// hasil dari fold and reduce akan digunakan untuk iterasi selanjutnya

// reduce((R,T)->R):R
// fold(R,(R,T)->R):R

// reduceRight() & foldRight()
// reduceIndexed() & foldIndexed()
// reduceRightIndexed() & foldRightIndexed()
fun main() {
    val numbers = (1..100).toList().shuffled()

    // max perhitungan manual
    val max = numbers.reduce { first, second ->
        if(first > second) first    // jika element list pertama lbih besar dari element list kedua, maka return element list pertama
        else second // jika tidak return element list kedua
    }
    println(max)

    // min agregation manual
    val min = numbers.reduce { first, second ->
        if (first < second) first
        else second
    }
    println(min)

    // sum agregation/ perhitungan manual
    val sum = numbers.fold(0){ first, second ->
        first + second
    }
    println(sum)
    // sama dengan
    println(numbers.sum())

    println()
    val names = listOf("Dian", "Tri", "Budianto")
    // counter manual dengan fold
    val count = names.fold(0){ first, second -> // initial fold merupakan index
        first + 1
    }
    println(count)
    println(names.count())
}