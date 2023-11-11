fun main() {
    println(evenOrOdd(6))
    println(evenOrOdd(5))
    println(evenOrOdd(2))
    println(evenOrOdd(18))
}

fun evenOrOdd(number: Int) :String{

    if(number % 2 == 0) return "Even"
    else return "Odd"
}
/* Possible solution
fun evenOrOdd(number: Int) = when (number % 2) {
    0 -> "Even"
    else -> "Odd"
}
 */