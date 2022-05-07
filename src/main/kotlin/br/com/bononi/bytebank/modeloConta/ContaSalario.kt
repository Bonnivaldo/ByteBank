package br.com.bononi.bytebank.modeloConta

import br.com.bononi.bytebank.modeloPerfil.Cliente
import br.com.bononi.bytebank.modeloPerfil.Endereco
import kotlin.Int as Int1


class ContaSalario(
    titular: String,
    numero: Int1,

    ): Conta(
    numero = numero,
    titular = Cliente(nome = "" , sobrenome = "", cpf = "", endereco = Endereco(), senha = 0)
) {

    override fun saque(valor: Double) {
        println("Sacando na conta de ${this.titular}")
    if (saldo >= valor) {
        saldo -= valor
        println("Saque realizado no valor de $valor")
        println("Saldo Atual de ${this.titular}: ${this.saldo}")
    } else {
        println("Saldo insuficiente para o saque")
        println("Saldo Atualde ${this.titular}: ${this.saldo}")
    }
    println("---Fim da Operação de Saque---")
    }

    override fun trasfere(valor: Double, destino: Conta): Boolean {
        println("Sua modalidade de conta não permite transferências")
        return false
    }

    override fun mostraDadosConta() {
        println("Titular da contas.Conta ${this.titular}")
        println("Numero da contas.Conta ${this.numero}")
        println("Saldo Atual: ${this.saldo}")
        println("---Fim da Operação---")
    }

    override fun deposita(valor: Double) {
        println("Depositando na conta de ${this.titular}")
        this.saldo += valor
        println("Saldo Atual de ${this.titular}:  ${this.saldo}")
        println("---Fim da Operação de Depósito---")
    }

}

