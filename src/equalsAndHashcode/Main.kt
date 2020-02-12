package equalsAndHashcode

fun main() {
    val student1 = Student("Иван", "Иванов", "234234")
    val student2 = Student("Иван", "Иванов", "234234")

    val address1 = Address("Russia", "Lomonosova", 23)
    val address2 = address1.copy()
    println(address1)
    println(address2)
    println(address1.hashCode())
    println(address2.hashCode())
    if (address1 == address2){
        println("EQUALS")
    } else {
        println("DIFFER")
    }

    val (city, street, house) = address2
    println(city)

    //Destructors
    val (name, lastName, id) = student1
}
/*DATA
1. Автоматически переопределен toString
2. Автоматически переопределен hashcode и equals
3. Деструктивные операторы
4. метод copy


 */
data class Student(val name: String, val lastName: String, val id: String)

class Address(val city: String, val street: String, val house: Int){
    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = house

    fun copy(city:String = this.city, street: String = this.street, house: Int = this.house) : Address {
        return Address(city, street, house)
    }
}