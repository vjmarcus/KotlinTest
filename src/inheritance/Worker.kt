package inheritance

open class Worker (val name:String, val age: Int) {
    open fun worked(){
        println("Я работаю")
    }
}