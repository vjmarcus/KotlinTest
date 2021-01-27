package classes

abstract class Monster(val name: String, var healthPoints: Int, val strength: Int)

class Goblin(name: String = "Goblin", healthPoints: Int = 100, strength: Int = 10, override val damage: Int = 10)
    : Monster(name, healthPoints, strength), Fightable {
    override fun attack(target: Fightable): Int {
        val random = (0..target.damage).shuffled().last()
        return target.damage + random
    }
}

interface Fightable {
    val damage: Int
    fun attack(target: Fightable) : Int
}

fun main() {
    val goblin = Goblin(name = "Goblin")
    val goblin2 = Goblin(name = "Goblin2")

    fun increaseHealthPoints(goblin: Goblin, damage: Int) {
        goblin.healthPoints = goblin.healthPoints - damage
    }

    while(true) {

        var damage  = goblin.attack(goblin2)
        increaseHealthPoints(goblin2, damage)

        var damage2  = goblin2.attack(goblin)
        increaseHealthPoints(goblin, damage)
        if (goblin.healthPoints <= 0 || goblin2.healthPoints <= 0) {
            break
        }
        println("${goblin.name} attack ${goblin2.name} for $damage")
        println("${goblin2.name} attack ${goblin.name} for $damage2")

        println("Goblin has ${goblin.healthPoints} and Goblin2 has ${goblin2.healthPoints}")
        println("Goblin2 has ${goblin2.healthPoints} and Goblin has ${goblin.healthPoints}")
        Thread.sleep(1000)


    }
}