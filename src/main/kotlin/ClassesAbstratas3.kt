abstract class ContaBancaria {
    abstract val titular: String
    abstract var saldo: Float

    abstract fun sacar(n: Float)
}

class ContaCorrente(override val titular: String, override var saldo: Float) : ContaBancaria(){
    fun info(){
        println("$titular - Conta Corrente\nSaldo: R$$saldo\n")
    }

    override fun sacar(n: Float) {
        saldo -= n
        println("Foram sacados R$$n da conta corrente.\nSaldo Atual: R$$saldo\n")
    }
}

class ContaPoupanca(override val titular: String, override var saldo: Float) : ContaBancaria(){
    fun info(){
        println("$titular - Conta Poupança\nSaldo: R$$saldo\n")
    }

    override fun sacar(n: Float) {
        saldo -= n
        println("Foram sacados R$$n da conta poupança.\nSaldo Atual: R$$saldo\n")
    }
}

fun main(){
    val contadocaio = ContaCorrente("Caio Hygino", 98000f)
    contadocaio.info()
    contadocaio.sacar(250.5f)

    val contadovitor = ContaPoupanca("Vitor Melo", 100f)
    contadovitor.info()
    contadovitor.sacar(10f)
}