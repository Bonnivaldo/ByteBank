class CargoAnalista(
    nome: String,
    sobrenome: String,
    cpf: String,
    salario: Double,
    tipo: Int) : CargoFuncionario(nome, sobrenome, cpf, salario) {

    override val bonificacao: Double
        get() {
            println("Bonificação Analista")
            return salario * 0.1
        }


    override fun mostraDados() {}

}

