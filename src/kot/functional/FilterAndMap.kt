package kot.functional

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for( i in 0..99){
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
}