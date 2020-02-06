package functions

fun main() {
    val sum = sum(10, 20)
    println(sum)
}
// Обычная функция, после двоеточия возвращаемое значение
fun myFunction(a: Int, b: Int) : Int {
    return a + b
}
// Функция без возвращаемого значения
fun double(a: Int, b: Int) : Unit {
}
// Пустая функция
fun function(){}
// Сразу пишем тело функции через равно, Котлин сам поймет, что вернуть 
fun sum(a: Int, b: Int) = a + b