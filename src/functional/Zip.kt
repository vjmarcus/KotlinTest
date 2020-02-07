package functional

// Метод ZIP обьеденяет две коллекции, в примере коллекция имен и телефонов, имен и фамилий
fun main() {
    val longNum = (0..10).random()
    println(longNum)
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..1000) {
        names.add("Имя$i")
        phones.add((("7921" + (1_000_000..9_999_999).random()).toLong()))
    }

    val users = names.zip(phones)
    for (user in users) {
        println("Имя ${user.first} Телефон ${user.second}")
    }

    val nameArray = mutableListOf<String>()
    val surnameArray = mutableListOf<String>()
    for (i in 0..100) {
        nameArray.add("ИМЯ$i")
        surnameArray.add("ФАМИЛИЯ$i")
    }
    val fullNamesArray = nameArray.zip(surnameArray)
    for( user in fullNamesArray){
        println("ИМЯ - ${user.first}, ФАМИЛИЯ - ${user.second}")
    }
}