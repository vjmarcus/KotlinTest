package singleton

fun main() {
    val db = Database.getInstance()
    val dbSingleton = DatabaseSingleton
    dbSingleton.insertData("asd2")
    db.insertData("21")
    db.insertData("1")
    db.insertData("4")
    val test = Test()
    test.insertTestData("5")

    for (string in db.data){
        println(string)
    }
    for (string in dbSingleton.data){
        println(string)

    }
}