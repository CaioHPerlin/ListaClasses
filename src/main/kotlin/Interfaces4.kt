interface Autenticavel{
    fun autenticar(log: String, sen: String)
}

class Usuario(val login: String, val senha: String): Autenticavel{
    override fun autenticar(log: String, sen: String) {
        if(log == login && sen == senha){
            println("Usuário autenticado!")
        }else{
            println("Credenciais incorretas inseridas.")
        }
    }
}

fun main(){
    val caio = Usuario("CaioHPLima", "meucachorrolate")
    caio.autenticar("CaioHPLima", "meucachorromia")
    caio.autenticar("CaioHPLima", "meucachorrolate")
}