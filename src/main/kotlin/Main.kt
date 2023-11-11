fun main() {
    println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"))
    println(highAndLow("1 2 3"))
}

fun highAndLow(numbers: String): String{

    val x = numbers.split(" ").map { it.toInt() }.sorted()
    return "${x.last()} ${x.first()}"
}