abstract class Animal {
    abstract fun emitirSom()
}

class Cachorro: Animal() {
    override fun emitirSom() {
        println("O cachorro late!")
    }
}

class Gato: Animal() {
    override fun emitirSom() {
        println("O gato mia!")
    }
}

fun main() {
    val pipe = Cachorro()
    val guto = Gato()

    pipe.emitirSom()
    guto.emitirSom()
}