package app

// 33. agregate
// max() & min()
// average()
// sum()
// count()
// maxBy(lambda selector) & minBy(selector)
// maxWith(comparator/pair) & minWith   => mengambil nilai max & min sesuai comparator
// sumBy(selector)  => mengambil nilai jumlah seluruh element sesuai selector   (deprecated -> sumOf)
// sumByDouble(selector)    => sama dengan sum, tapi menghasilkan double
fun main() {
    val numbers = (1..10).toList()
    println(numbers.maxOrNull())
    println(numbers.minOrNull())
    println(numbers.average())
    println(numbers.sum())

    println()
    println(numbers.sumOf { it / 2 })
}