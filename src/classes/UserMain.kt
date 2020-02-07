package classes

fun main() {
    val userJava = UserJava("vjmarcus@list.ru")
    println("Java example:  ${userJava.getEmail()}")

    val userKotlin = UserKotlin("kotlin@list.ru")
    println("Kotlin example: ${userKotlin.email}")
}
