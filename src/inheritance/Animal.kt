package inheritance

// Помечаем open если хотим наследоваться от класса, по умолчанию он final
open class Animal(val name: String, var weight: Float, val habitat: String ) {

    open fun eat() {
        println("Кушаю еду")
    }
    open fun run() {
        println("Бегу")
    }
}