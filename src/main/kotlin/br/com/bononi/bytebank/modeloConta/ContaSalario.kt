package br.com.bononi.bytebank.modeloConta

import br.com.bononi.bytebank.modeloPerfil.Cliente
import br.com.bononi.bytebank.modeloPerfil.Endereco
import kotlin.Int as Int1


class ContaSalario(
    titular: Cliente,
    numero: Int1,

    ): Conta(
    numero = numero,
    titular = titular
) {

    override fun trasfere(valor: Double, destino: Conta) {
        println("Sua modalidade de conta não permite transferências")
        return
    }



}

