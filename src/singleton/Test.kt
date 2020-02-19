package singleton

class Test {
    fun insertTestData(string: String) {
        Database.getInstance().insertData(string)
    }
}