package kot

import java.util.*


fun main() {
    val month: String
    println("Введите первую букву месяца на английском")
    val scanner = Scanner(System.`in`)
    month = scanner.nextLine()
    when (month) {
        "J" -> println("January")
        "F" -> println("February")
        "M" -> println("Mart")
        else -> println("Не найдено")
    }




//    var count = 400
//    val food = if (count > 500) {
//        count -= 100
//        "Пицца"
//    } else if (count > 300) {
//        count -= 200
//        "Шаверма"
//    } else {
//        "Яблоко"
//    }
//    println(food)
//    println("Количество денег: $count, вы едите - $food, длина строки - ${food.length}")


//    val a: String? = null
//    val b: String? = "234234"
//    val c: String? = ""
//    val result: Int? = (a?.length?:0) + (b?.length?:0) + (c?.length?:0)
//    println(result)
}