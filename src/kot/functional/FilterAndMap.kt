package kot.functional

import kotlin.random.Random

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    for (i in listOfNumbers) {
        println(i)
    }
    // Выведем все четные числа
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        println(i)
    }
    // Выведем все имена, начинающиеся на А
    val listOfNames = listOf("Oleg", "Andrey", "Kirill")
    val listWithNewNames = listOfNames.filter { it.startsWith("A") }
    for (i in listWithNewNames) {
        print(i)
    }
    // Создадим коллекцию чисел
    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { it * 2 }
    for (i in doubledNumbers) {
        println(i)
    }
    // Коллекцию мап можно превратить в любую коллекцию типов элементов
    val employees = numbers.map { "Employee #$it" }
    for (i in employees) {
        println(i)
    }
    // Метод сортировки
    val array = arrayOf(23, 234, 432, -234, 23, 55, 222)
    val sortedArray = array.sorted()
    val sortedDescending = array.sortedDescending()
    for (num in sortedArray) {
        println(num)
    }
    println("Descending")
    for (num in sortedDescending) {
        println(num)
    }

    val arrayOfThousands = mutableListOf<Int>(1000)
    for (i in 0 until 1000) {
        arrayOfThousands.add((Math.random() * 1000).toInt())
    }
    println("HOMEWORK")
    val fiveOrThree = arrayOfThousands.filter { it % 5 == 0 || it % 3 == 0 }
    for (i in fiveOrThree) {
        println(i)
    }
    val squareArray = arrayOfThousands.map { it * 2 }
    for (i in squareArray) {
        println(i)
    }
    val arrayOfThousandsDescending = arrayOfThousands.sortDescending()

    // Превратить в коллекцию
    val arrayOfThousandsToString = arrayOfThousands.map { "$it" }
    for (i in arrayOfThousands) {
        println(i)
    }

    // Можно сделать все это в одну строчку
    val result = arrayOfThousands.filter { it % 3 == 0 || it % 5 == 0 }
        .map { it * 2 }.sortedDescending().map { "$it" }
}