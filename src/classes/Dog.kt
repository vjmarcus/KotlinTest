package classes

class Dog {
    var name: String = ""
    get() = field.toLowerCase().capitalize()
    var age: Int = 0
    set(value) {
        if (value <= 0) {
            field = 10
        }
    }
    var weight: Int = 0
    set(value) {
        if (value <= 0) {
            field = 10
        }
    }
}