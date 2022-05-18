package br.com.bononi.bytebank.modeloConta

import br.com.bononi.bytebank.modeloPerfil.Cliente


class ContaCorrente(
    titular: Cliente,
    numero: Int,

    ) : Conta(
    titular = titular,
    numero = numero
) {


}