package Generics

class LootBox <T> (item: T) {
    var open = false
    private val loot: T = item

    fun fetch() : T? {
        return loot.takeIf {
            open
        }
    }
}

class Fedora(val name: String, val value: Int)

class Coin(val value: Int)

fun main() {
    val box1 = LootBox(Fedora("generic fedora", 15))
    val box2 = LootBox(Coin(10))
}