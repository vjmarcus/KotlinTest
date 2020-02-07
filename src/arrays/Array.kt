package arrays

fun main() {
    val numbers0: Array<Int>

    //С помощью встроенной функции arrayOf() можно передать набор значений, которые будут составлять массив:
    val numbers1: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val numbers2 = Array(3) {5} // [5, 5, 5]
}