package classes

fun main() {
    val user = User()
    user.name = null
    user.age = -35
    //Напрямую обращаемся к полям
    println("Name = ${user.name}, Age = ${user.age}")

    val dog = Dog()
    dog.name = "Bob"
    dog.age = 15
    dog.weight = 39

    println("Name ${dog.name}, Age ${dog.age}, Weight ${dog.weight}")
}