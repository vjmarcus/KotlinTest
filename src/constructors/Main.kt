package constructors

fun main() {
    val russia = Country("Russia", 144_000_000)
    println(russia.name)
    russia.population = 145_000_000
    println(russia.population)

    var book = Book("Book name")
    println(book.name)
    println(book.price)

}
class Country(var name: String = "", var population: Long = 0) {
    constructor() : this ("", 0){
    }
}
class Book(var name: String = "", var age: Int? = null, var price: Int? = null){

}