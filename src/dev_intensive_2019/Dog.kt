package dev_intensive_2019

class Dog (var name: String, var age:Int){
    constructor() : this("dog", 10)

    override fun toString(): String {
        return "Dog(name='$name', age=$age)"
    }

}

fun main() {
    val dog = Dog()
    println(dog)
    val dog2 = Dog("barbos", 11)
    println(dog2)
}