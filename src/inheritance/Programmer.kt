package inheritance

class Programmer (language: String): Worker("Oleg", 23) {
    override fun worked() {
        println("Пишу код")
    }
}