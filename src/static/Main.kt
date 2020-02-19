package static

/*companion object as static*/
fun main() {
    println(Calc.square(10))
    println(Calc.lengthOfCircle(10f))
    println(MyRandom.randomInt(10, 15))
    println(MyRandom.randomBool())
}
class Calc{
    companion object {
        private const val PI = 3.14
        fun square(num: Int) = num * num
        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}
class MyRandom {
    companion object {
        fun randomInt( from: Int, to: Int) = (Math.random() * ((to - from) + 1)).toInt() + from
        fun randomBool() = randomInt(0, 1) > 0
    }
}