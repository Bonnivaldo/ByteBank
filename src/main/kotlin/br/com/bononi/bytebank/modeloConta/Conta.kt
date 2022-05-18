package br.com.bononi.bytebank.modeloConta

import br.com.bononi.bytebank.exception.FalhaAutenticacao
import br.com.bononi.bytebank.exception.SaldoInsuficienteException
import br.com.bononi.bytebank.funcionamentoInterno.MostraDados
import br.com.bononi.bytebank.modeloPerfil.Cliente

abstract class Conta(val titular: Cliente, val numero: Int) {

    var saldo: Double = 0.0
    protected set

    companion object Contador{
        var totalContas = 0
            private set
    }

    init{
        println("Criando conta")
        totalContas++
    }

    open fun saque(valor: Double = 0.0){
        if (saldo < valor){
            throw SaldoInsuficienteException()
            println("Saldo insuficiente para o saque")
            println("Saldo Atual de ${this.titular.nome}: ${this.saldo}")
        }
        println("Sacando na conta de ${this.titular.nome}")

        saldo -= valor

        println("Saque realizado no valor de $valor")
        println("Saldo Atual de ${this.titular.nome}: ${this.saldo}")

        println("---Fim da Operação de Saque---")
    }

    open fun deposita(valor: Double){
        println("Depositando ${valor} para a conta de ${this.titular.nome}")
        this.saldo += valor
        println("Saldo atual: $saldo")
        println("---Fim da Operação de Depósito---")
    }

    open fun trasfere(valor: Double, destino: Conta) {
        println("Transferindo da conta de ${this.titular.nome} para a conta de ${destino.titular}")
        if (saldo < valor){
            throw SaldoInsuficienteException(mensagem = "Falha na transferência")
            println("Saldo insuficiente")
            println("Saldo Atual: ${this.saldo}")

            println("---Fim da Operação de Transferência---")
        }
        if (!titular.autentica(senha = 123456)){
            throw FalhaAutenticacao(mensagem = "Falha na Autenticação")
        }
        saldo -= valor
        destino.deposita(valor)
        println("Tranferência realizada no valor de $valor")
        println("Saldo Atual de ${this.titular.nome}: ${this.saldo}")
        println("---Fim da Operação de Transferência---")
    }



}