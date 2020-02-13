package inheritance

fun main() {
    val dog = Dog(4f)
    println(dog.habitat)
    println()
    val programmer = Programmer("Java")
    val student = Worker("Kolya", 23)
    val professor = Worker("Evgeniy victorovich", 53)
    val workers = mutableListOf<Worker>()
    workers.add(student)
    workers.add(programmer)
    workers.add(professor)
    for (i in workers){
        println(i.worked())
    }

}