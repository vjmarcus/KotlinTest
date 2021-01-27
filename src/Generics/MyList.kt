package Generics

interface MyList <T>{

    operator fun get(index: Int) : T
    fun add(string: T)
    fun delete(element:T)
    fun removeAt(index: Int)
    fun size(): Int
}