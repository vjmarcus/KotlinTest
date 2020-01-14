package kot


fun main() {

    val a = 4
    val b = 5
    println(returnString("Mikhailov"))
}

fun returnString(string: String) : String =  string.substring(0, 5)

//    val array = arrayOfNulls<Int?>(301)
//    for (i in 300..600) {
//        array[i - 300] = i
//    }
//    for ((index, i) in array.withIndex()) {
//        array[index]
//    }

//    val array = arrayOfNulls<Int?>(10)
//    println(array[3])

//    val array = arrayOfNulls<Int?>(100)
//
//    for(i in array.indices) {
//        array[i] = i
//    }
//
//    for (i in array.indices) {
//        println(array[i])
//    }




//    for (i in 100 downTo 0)
//        println(i)

//    for (i in intArray)
//        println(i)


//    val array = IntArray(101)
//    for (i in array.indices) {
//        array[i] = i
//    }
//    for (i in array) {
//        println(i)
//    }





//    val listOfNumbers: MutableList<Int> = LinkedList<Int>()
//    listOfNumbers.add(1)
//    println(listOfNumbers.size)
//    listOfNumbers.remove(listOfNumbers[0])
//    println(listOfNumbers.size)


//    val timeNow: Int
//    val weatherIsGood: Boolean
//
//    val scanner = Scanner(System.`in`)
//    println("Сколько сейчас времени?")
//    timeNow = scanner.nextInt()
//    println("Какая сейчас погода, хорошая или плохая?")
//    weatherIsGood = scanner.nextBoolean()
//    val result: String = when {
//        timeNow in 7..23 && weatherIsGood -> {
//            "Идем гулять"
//        }
//        timeNow in 7..23 && !weatherIsGood -> {
//            "Читаем книгу"
//        }
//        else -> {
//            "Спать"
//        }
//    }
//    println(result)


    //    val month: Int
    //    println("Введите номер месяца:")
    //    val scanner = Scanner(System.`in`)
    //    month = scanner.nextInt()
    //    val result: String = when (month) {
    //        in 3..6 -> {
    //            "ЯНВАРЬ ФЕВРАЛЬ МАРТ"
    //        }
    //        in 7..21 -> {
    //            "Зима"
    //        }
    //        else -> {
    //            "Не найдено"
    //        }
    //    }
    //    println("$result")


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