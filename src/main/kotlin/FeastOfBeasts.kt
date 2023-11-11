fun main() {

    println(feast("dog", "doooooooooog"))

}

fun feast(animal: String, dish: String) : Boolean{

    val aCount : Int= animal.length
    val dCount : Int= dish.length

    if((animal[0] == dish[0]) && (animal[aCount -1] == dish[dCount-1])) return true
    else return false

    //The MUCH better version of this
    //fun feast(beast: String, dish: String) = beast.first() == dish.first() && beast.last() == dish.last()


}