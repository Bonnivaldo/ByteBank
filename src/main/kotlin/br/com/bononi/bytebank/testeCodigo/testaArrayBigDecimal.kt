package br.com.bononi.bytebank.testeCodigo

import br.com.bononi.bytebank.funcionamentoInterno.bigDecimalArrayOF
import br.com.bononi.bytebank.funcionamentoInterno.calculaAumentoRelativo
import br.com.bononi.bytebank.funcionamentoInterno.media
import br.com.bononi.bytebank.funcionamentoInterno.somatoria
import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayBigDecimal() {
    val salarios = bigDecimalArrayOF("1500.55", "2000.31", "5000.12", "10000.02")

    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()


    println(salariosComAumento.contentToString())

    val gastoInicial = salariosComAumento.somatoria()
    println(gastoInicial)

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println(gastoTotal)

    val media = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .media()
    println(media)

    val mediaMenores = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println(mediaMenores)
}