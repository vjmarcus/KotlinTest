import java.util.Scanner

fun main(args: Array<String>) {

    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
    var a = scan.nextLine()
    var b = scan.nextLine()

    if (a.contains(b, true))
        println(true)
    else
        println(false)

}

/*fun main(args: Array<String>) {

    val scan = java.util.Scanner(System.`in`).useLocale(java.util.Locale.US)
    var a = scan.nextLine()
    var b = scan.nextLine()

    if (a.contains(b, true))
        println(true)
    else
        println(false)

}*/
