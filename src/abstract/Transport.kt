package abstract

abstract class Transport(open val name: String) {
    abstract fun drive();
}