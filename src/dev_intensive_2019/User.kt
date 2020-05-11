package dev_intensive_2019

class User {
    var age: Int = 0
    // переопределяем setter, value - то, что устанавливаем, поле - field
    set(value) {
        field = if (value <= 0) {
            0
        } else {
            value
        }
    }
    var name: String? = null
    // чтобы обратиться к полю, для которого устанавливаем геттер используем field
    get() {
        return if (field == null) {
            ""
        } else {
            field
        }
    }
}