abstract class Veiculo {
    abstract val modelo: String
    abstract val ano: Int
}

class Carro(override val modelo: String, override val ano: Int) : Veiculo() {
    fun exibirInfo(){
        println("Informações sobre o carro:\nModelo: $modelo\nAno: $ano\n")
    }
}

class Moto(override val modelo: String, override val ano: Int) : Veiculo() {
    fun exibirInfo(){
        println("Informações sobre a moto:\nModelo: $modelo\nAno: $ano\n")
    }
}

fun main(){
    val pfister = Carro("PFISTER811", 2013)
    val bati = Moto("BATI811", 2013)
    pfister.exibirInfo()
    bati.exibirInfo()
}