package main.kotlin

fun main() {
    println(convert(false))
}

fun convert(b: Boolean): String {
    if(b) return "true"
    else return "false"
}
/* Better way to do this
    fun convert(b: Boolean) = "$b"
 */