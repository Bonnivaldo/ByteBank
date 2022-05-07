package br.com.bononi.bytebank.testeCodigo

import br.com.bononi.bytebank.modeloPerfil.Endereco

class testaAny {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-070"
    )
    val enderecoNovo = Endereco(
        logradouro = "Rua Vergueiro",
        complemento = "Alura",
        cep = "00000-070"
    )

//    println
//    println(endereco.equals(enderecoNovo))
//
//    println(endereco.hashCode()) //Id do objeto
//    println(enderecoNovo.hashCode()) //Id do objeto
//
//    println(endereco.toString())


}

fun imprime(valor: Any) : Any{
    println(valor)
    return valor


}