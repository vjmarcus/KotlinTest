package lambda

fun main() {

    //Круглые скобки указывают на лябду
    //Слева от стрелки параметр, справа от стрелки выражение
    val lambda = { param: Int -> param * param }

    // Теперь попробуем передать в лябмду цифру в качестве параметра
    var result = lambda.invoke(3)
    println(result) // 9

    // Два параметра
    val lambda2 = { param1: Int, param2: Int -> param1 + param2 }
    println(lambda2.invoke(5, 5))

    // Три параметра c условием
    val lambda3 = { param1: Int, param2: Int, param3: Boolean ->
        if (!param3) {
            param1 - param2
        } else {
            param1 + param2
        }
    }

    println(lambda3.invoke(12, 12, true))
}
