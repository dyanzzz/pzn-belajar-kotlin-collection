package app

// 24. windowed operator
// mendapatkan semua kemungkinan collection sesuai dengan range yg ditentukan
fun main() {
    // windowed(size, step, partialWindow)  // mengambil semua kemungkinan collection sebesar size, lanjut pstep, dan diakhiri dengan partialWindow
    // windowed(size, step, partialWindow, transform)   // sama seperti windowed sebelumnya, namun hasil collection di transform

    val range = (1..5).toList()
    // windowed(size, step, partialWindow)
    // partial window false, berarti tidak menampilkan yg jumlahnya tidak sesuai size
    println(range.windowed(3, 1, false))            // menampilkan list sesuai dengan range yg di tentukan
    println(range.windowed(3, 1, false){ it.size }) // masing" value pada list di jumlahkan
    println(range.windowed(3, 1, true))
    println(range.windowed(3, 1, true){ it.size })
    println(range.windowed(3, 2, false))
    println(range.windowed(3, 2, true))
}