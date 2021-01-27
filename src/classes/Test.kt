package classes


fun main() {
    class Player(_name: String, var age: Int = 10, var breed: Boolean = false){
        val homeTown = getTown()
        val name = _name
        get()  = "${field.capitalize()} from $homeTown"
        init {
            require(age > 0) {
                "age must be bigger"
            }
            require(name.isNotBlank()) {
                "name must be not blank"
            }
        }

        private fun getTown() : String {
            val list = listOf("Spb", "Msk", "Novosibirsk", "Anapa")
            return list.shuffled().first()
        }
    }

    val player = Player(_name = "GOGOL", age = 34)
    val player2 = Player(_name = "Korben", breed = true)
    val player3 = Player("Boris", 15, true)

    val list = listOf(player, player2, player3)
    list.forEach {
        println("name is ${it.name}, age is ${it.age} and breed is ${it.breed} from ${it.homeTown}")
    }
}
