package functional

fun main() {
    // После стрелки то, что хотим вернуть, анонимная функция без имени, лямбда выражение
    val sum = {a: Int, b: Int -> a + b}
    // Тоже самое, указаны параметры функции и возвращаемое значение, тип параметров можно не указывать
    val sum2 : (Int, Int) -> Int = {a, b -> a + b}
    println(sum(2, 10))

    val square  = {a: Int -> a * a}
    /* Тоже самое, указали тип передаваемого значения, значит компилятор знает и сам создает переменную нужного типа,
    она называется it, возможно если параметр только один
    * */
    val square2: (Int) -> Int  = {it * it}
    println(square(5))

    val perimeter = {a: Int, b: Int -> (a + b)* 2}
    println("Периметр прямоугольника = " + perimeter(5, 10))

    val name: (String) -> Unit = { println("Привет, $it")}
    name("Oleg")

// Пузырьковая сортировка
    val array: (Array<Int>) -> Array<Int> = {
        for ( i in it.size - 2 downTo 0)
            for (j in 0..i)
                if (it[j] < it[j + 1]){
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
        it
    }
    val sortedArray = array(arrayOf(3, 34, 56, 234))
    for (i in sortedArray) {
        println(i)
    }
}