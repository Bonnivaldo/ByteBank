package br.com.bononi.bytebank.funcionamentoInterno

import br.com.bononi.bytebank.modeloPerfil.CargoFuncionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: CargoFuncionario){
        println("Nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }

//    fun registra(gerente: Gerente) {
//        this.total += gerente.bonificacao
//    }
//
//    fun registra(diretor: Diretor){
//        this.total += diretor.bonificacao
//    }


}