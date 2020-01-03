package kot

import java.util.*


fun main() {
    val food: String
    val count = 400
    food = if (count > 500) {
        "Пицца"
    } else if (count > 300) {
        "Шаурма"
    } else {
        "Яблоко"
    }
    println(food)


//    val a: String? = null
//    val b: String? = "234234"
//    val c: String? = ""
//    val result: Int? = (a?.length?:0) + (b?.length?:0) + (c?.length?:0)
//    println(result)
}