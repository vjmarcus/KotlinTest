package npe

fun main() {
    val st: String = "Hello"
    val size = st.length
    println(size)
}
// Указывая знак вопроса после типа мы соглашаемся с тем, что может быть null

fun getSt(): String? {
    return null
}