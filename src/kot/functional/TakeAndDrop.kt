package kot.functional

fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee №$it" }
    // Возьмем первых 30 сотрудников
    val first30 = employees.take(30)
    val last30 = employees.takeLast(30)
    println("-----------fist30----------")
    printArray(first30)
    printArray(last30)

    // Метод drop выбрасывает первые елементы или dropLast выбрасывает последние элементы
    val dropFirst950 = employees.drop(950)
    printArray(dropFirst950)
    val dropLast970 = employees.dropLast(970)
    printArray(dropLast970)

    // Бесконечная последовательность и ленивая инициализация
    val infinityArray = generateSequence(0) {it + 2}
    val evenList = infinityArray.take(10)
    val infinityEmployees = generateSequence ("Employee№1"){
        val index = it.substring(9).toInt()
        "Employee№${index + 1}"
    }
    val listOf100First = infinityEmployees.take(100)
    for (i in listOf100First) {
        println(i)
    }

}



fun printArray(array: List<String>): Unit {
    println("------------START------------")
    for (i in array) {
        println(i)
    }
    println("-------------END-------------")
}
