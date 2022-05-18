package br.com.bononi.bytebank.modeloConta

import br.com.bononi.bytebank.exception.SaldoInsuficienteException
import br.com.bononi.bytebank.modeloPerfil.*

class ContaPoupança(
    titular: Cliente,
    numero: Int,
) : Conta(
    numero = numero,
    titular = titular
) {


}

