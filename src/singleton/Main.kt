package singleton

fun main() {
    val db = Database.getInstance()
    db.insertData("21")
    db.insertData("1")
    db.insertData("4")
    val test = Test()
    test.insertTestData("5")

    for (string in db.data){
        println(string)
    }
}