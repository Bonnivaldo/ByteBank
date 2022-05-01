class CargoDiretor(
    nome: String,
    sobrenome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : CargoFuncionarioAdmin(nome, sobrenome, cpf, salario, senha) {

    override val bonificacao: Double
        get() {
            println("Bonificação Diretor")
            return salario * 0.2
        }

    override fun mostraDados() {}

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            println("Bem vindo ao ByteBank")
            return true
        } else {
            println("Falha na autenticação")
            return false
        }
    }


}