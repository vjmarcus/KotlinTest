package abstract

class Car(override var name: String = "Машина") : Transport(name){
    fun startEngine() : Boolean {
        println("Запускаю двигатель")
        return true
    }

    override fun drive() {
        println("Машина едет")
    }
}