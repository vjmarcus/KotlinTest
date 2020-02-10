package methods

import java.util.*


fun main() {

    val cat = Cat("Catty", 23)
    cat.printInfo()
    println(cat.isOld)
    cat.age = 10
    println(cat.isOld)
    println()
    val employee = Employee("Oleg", "Android Dev", 2019)
    employee.work()
    employee.printEmployee()
}
fun Employee.printEmployee(){
    println("Name $name Position $position Year $year Experience $experience")
}
class Cat(val name: String, var age: Int, val weight: Float = 0f){

    val isOld :Boolean
    get() = age >= 12
    fun printInfo(){
        println("Name $name, Age $age, Weight $weight")
    }
}
class Employee(val name:String, val position: String, val year: Int){
    val experience: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - year
    fun work(){
        println("Worked")
    }
}

