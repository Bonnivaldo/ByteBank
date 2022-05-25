package br.com.bononi.bytebank.modeloPerfil

abstract class CargoFuncionario(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    val salario: Double
) {

    abstract val bonificacao: Double

    open fun mostraDados() {
        println("Colaborador: ${this.nome} ${this.sobrenome}")
        println("CPF: ${this.cpf}")
        println("Salário: ${this.salario}")
    }
}
