abstract class CargoFuncionarioAdmin(
    nome: String,
    sobrenome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int?
    ): CargoFuncionario(nome, sobrenome, cpf, salario), Autenticavel{

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
