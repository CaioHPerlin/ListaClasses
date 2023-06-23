interface Imprimivel{
    fun imprimir()
}

class Contrato: Imprimivel{
    override fun imprimir() {
        println("Este é um contrato!")
    }

}

class Foto: Imprimivel{
    override fun imprimir() {
        println("Esta é a uma foto!")
    }
}

fun main() {
    val contrato = Contrato()
    val foto = Foto()

    contrato.imprimir()
    foto.imprimir()
}