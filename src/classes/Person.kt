package classes

fun main() {
    val car = Car(23, 12)
    println(car.isNew)
}
class Person(name:String, lastName: String, age: Int)

class Car(private var weight: Int,private var size: Int){

    val isNew: Boolean

    get() {
        return weight > size
    }
}