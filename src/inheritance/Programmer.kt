package inheritance

class Programmer (name:String, age: Int, var language: String): Worker(name, age) {
    override fun worked() {
        println("Пишу код на $language")
    }
}