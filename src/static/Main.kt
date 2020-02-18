package static

/*companion object as static*/
fun main() {
    println(Calc.square(10))
    println(Calc.lengthOfCircle(10f))
}
class Calc{
    companion object {
        private const val PI = 3.14
        fun square(num: Int) = num * num
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}