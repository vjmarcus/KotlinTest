package static

/*companion object as static*/
fun main() {
    println(Calc.square(10))
}
class Calc{
    companion object {
        fun square(num: Int) = num * num
    }
}