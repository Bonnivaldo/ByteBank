package br.com.bononi.bytebank.exception

class SaldoInsuficienteException(
    mensagem: String = "O saldo é insuficiente"
): Exception(mensagem)