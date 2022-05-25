package br.com.bononi.bytebank.funcionamentoInterno

import java.math.BigDecimal
import java.math.RoundingMode

    fun bigDecimalArrayOF(vararg valores: String): Array<BigDecimal> {
        return Array<BigDecimal>(valores.size) { i -> valores[i].toBigDecimal() }
    }

    fun Array<BigDecimal>.somatoria(): BigDecimal {
        return this.reduce { acumulador, valor ->  acumulador + valor }
    }

    fun Array<BigDecimal>.media(): BigDecimal {
        return if(this.isEmpty()){
            BigDecimal.ZERO
        } else {
            this.somatoria() / this.size.toBigDecimal()
        }
    }

    fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
        if (salario < "5000".toBigDecimal()) {
            salario + "500.00".toBigDecimal()
        } else {
            (salario * aumento).setScale(2, RoundingMode.UP)
        }
