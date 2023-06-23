interface Calculavel{
    fun somar(n1: Int, n2: Int)
    fun subtrair(n1: Int, n2: Int)
    fun multiplicar(n1: Int, n2: Int)
    fun dividir(n1: Int, n2: Int)
}

class Calculadora: Calculavel{
    override fun somar(n1: Int, n2: Int) {
        println("$n1 + $n2 = ${n1+n2}")
    }

    override fun subtrair(n1: Int, n2: Int) {
        println("$n1 - $n2 = ${n1-n2}")
    }

    override fun multiplicar(n1: Int, n2: Int) {
        println("$n1 * $n2 = ${n1 * n2}")
    }

    override fun dividir(n1: Int, n2: Int) {
        println("$n1 / $n2 = ${n1/n2}")
    }
}

fun main() {
    val calc = Calculadora()
    calc.somar(2, 4)
    calc.subtrair(4, 6)
    calc.multiplicar(2, 5)
    calc.dividir(20, 5)
}