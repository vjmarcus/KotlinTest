package inheritance

fun main() {
    val dog = Dog(4f)
    println(dog.habitat)
    println()
    val programmer = Programmer("Oleg", 35, "Kotlin")
    val programmer2 = Programmer("aSdf", 23, "Java")
    val worker = Worker("Worker", 34)
    val worker2 = Worker("Worker2", 32)
    programmer.worked()

}