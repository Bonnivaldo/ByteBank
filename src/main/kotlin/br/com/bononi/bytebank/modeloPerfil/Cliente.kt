package br.com.bononi.bytebank.modeloPerfil

import br.com.bononi.bytebank.funcionamentoInterno.Autenticavel

class Cliente(
    val nome: String,
    val sobrenome: String,
    val cpf: String,
    var endereco: Endereco,
    private val senha: Int
): Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            println("Bem vindo ao ByteBank")
            return true
        } else {
            println("Falha na autenticação")
            return false
        }
    }



}