package extensions

fun main() {
    fun <T> T.easyPrint() : T {
        println(this)
        return this
    }
    val int = 34
    int.easyPrint().easyPrint().easyPrint()
}