package collections

fun main() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
    val readOnlyView: List<Int> = numbers
    println(numbers)        // выведет "[1, 2, 3]"
    numbers.add(4)
    println(readOnlyView)   // выведет "[1, 2, 3, 4]"
   // readOnlyView.clear()    // -> не скомпилируется

    val strings = hashSetOf("a", "b", "c", "c")
    assert(strings.size == 3)
}