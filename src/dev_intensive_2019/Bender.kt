package dev_intensive_2019


/*
*Стандартный класс, можем сразу проинициализировать переменные дефолтными значениями, передав только те переменные,
* у которых нет дефолтных значений
* Всегда есть Primary constructor и один или несколько secondary constructor
* Ключевое слово this используется для того, чтобы ссылаться на Primary constructor
*/
class Bender(
    // Primary Constructor
    var name: String,
    var material: String = "steel",
     val fuel: String = "alcohol",
     val model: String = "Bending",
     val serial: Int = 223121312
) {
    /*При создании вторичного конструктора обязаны вызвать первичный, вызываем через this и передаем туда параметры
    * */
//    constructor(name: String,  material) : this(name = "", material = "plastic")


    override fun toString(): String {
        return "Bender(name='$name', fuel='$fuel', material='$material', model='$model', serial=$serial)"
    }

    //Блок инициализации, который будет выполнен в любом случае
    init {
        println("I'm alive and my name is $name!")
    }
}