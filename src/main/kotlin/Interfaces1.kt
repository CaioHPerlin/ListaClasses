interface Imprimivel{
    fun imprimir()
}

class Contrato: Imprimivel{
    override fun imprimir() {
        println("")
    }

}

class Foto: Imprimivel{
    override fun imprimir() {

    }
}