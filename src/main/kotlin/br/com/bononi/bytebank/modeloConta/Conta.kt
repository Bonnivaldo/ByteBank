package br.com.bononi.bytebank.modeloConta

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

    abstract fun mostraDadosConta()

    abstract fun deposita(valor: Double)

    abstract fun saque(valor: Double = 0.0)

    abstract fun trasfere(valor: Double, destino: Conta): Boolean


}