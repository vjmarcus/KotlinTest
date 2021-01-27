package collections

import kotlin.random.Random

fun main(){

    var mutMap = mutableMapOf<Int, Int>()

    for (n in 0..10) {
        mutMap[n] = (0..1000).random()
    }

    println(mutMap)

}