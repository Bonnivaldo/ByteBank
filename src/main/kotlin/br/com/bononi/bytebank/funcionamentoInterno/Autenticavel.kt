package br.com.bononi.bytebank.funcionamentoInterno

interface Autenticavel {

    fun autentica(senha: Int): Boolean
}