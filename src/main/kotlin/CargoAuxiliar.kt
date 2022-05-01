class CargoAuxiliar(
    nome: String,
    sobrenome: String,
    cpf: String,
    salario: Double,
    tipo: Int) : CargoFuncionario(
    nome = nome,
    sobrenome = sobrenome,
    cpf = cpf,
    salario = salario
) {

    override val bonificacao: Double
        get() {
            println("Bonificação Analista")
            return bonificacao + salario * 0.1
        }


    override fun mostraDados() {
        println("Colaborador: ${this.nome} ${this.sobrenome}")
        println("CPF: ${this.cpf}")
        println("Salário: ${this.salario}")
        println ("Bonificação: ${this.bonificacao}")
    }

}