package br.com.bononi.bytebank.testeCodigo

fun testaException(){

    val entrada: String = "1,0"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (e: NumberFormatException){
        println("Problema na conversão")
        e.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null){
        valorRecebido + 0.1
    }else{
        null
    }

    if (valorComTaxa != null){
        println("Valor Final: $valorComTaxa")
    } else {
        println("Valor inválido")
    }

}