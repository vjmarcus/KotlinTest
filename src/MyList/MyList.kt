package MyList

interface MyList {

    fun get(index: Int) : String
    fun add(string: String)
    fun delete(element:String)
    fun removeAt(index: Int)
    fun size(): Int
}