package filtrators



fun main() {

    generateSequence(0) { it + 1 }
        .onEach { println("The Count says: $it, ah ah ah!") }
}