package abstract

fun main() {
    val seller = Seller("Продавец", 21)
    val director = Director("Михаил Семенович", 43)
    val workers = mutableListOf<Worker>()
    workers.add(seller)
    workers.add(director)
    for (worker in workers){
        if (worker is Cleaner){
            worker.clean()
        }
    }
    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners){
        cleaner.clean()
    }
    println()
    val car: Transport = Car()
    val bicycle: Transport =  Bicycle()


    // Anonymous class
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет")
        }
    })

    val sportsman = Sportsman()
    sportsman.callWaterboy(object : Waterboy {
        override fun bringWater() {
            println("Вода принесена")
        }
    })
}

fun travel(transport: Transport){
    transport.drive()
}