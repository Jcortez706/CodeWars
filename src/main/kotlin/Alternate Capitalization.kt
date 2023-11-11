fun main() {
    println(spongebobMeme("hello"))
    println(capitalize("hello"))

}

fun spongebobMeme(funky: String):  List<String> {
   val funkyArray = funky.toCharArray()
    var check=0
    val funList = mutableListOf<String>()

    for (funk in funkyArray)
    {
        if(check % 2 == 0)
        {
            funkyArray[check] = funk.uppercaseChar()
        }
        check++

    }
    funList.add(String(funkyArray))
    check = 0
    for (funk in funkyArray)
    {
        if(check % 2 != 0)
        {
            funkyArray[check] = funk.uppercaseChar()
        }else funkyArray[check] = funk.lowercaseChar()

        check++

    }
    funList.add(String(funkyArray))
    return funList



}

//much better way to do it
fun capitalize(text: String): List<String> =
    listOf(
        text.mapIndexed { index, c -> if (index % 2 == 0) c.uppercaseChar() else c }.joinToString(""),
        text.mapIndexed { index, c -> if (index % 2 == 1) c.uppercaseChar() else c }.joinToString("")
    )