class ContaPoupança(
    titular: String,
    numero: Int,

) : Conta(
    numero = numero,
    titular = titular
) {
    var saldo: Double = 0.0

    override fun saque(valor: Double) {
        println("Sacando na conta de ${this.titular}")
    if (saldo >= valor) {
        saldo -= valor
        println("Saque realizado no valor de $valor")
        println("Saldo Atual de ${this.titular}: ${this.saldo}")
    } else {
        println("Saldo insuficiente para o saque")
        println("Saldo Atualde ${this.titular}: ${this.saldo}")
    }
    println("---Fim da Operação de Saque---")
    }

    override fun mostraDadosConta() {
        println("Titular da Conta ${this.titular}")
        println("Numero da Conta ${this.numero}")
        println("Saldo Atual: ${this.saldo}")
        println("---Fim da Operação---")
    }

    override fun deposita(valor: Double) {
        println("Depositando na conta de ${this.titular}")
        this.saldo += valor
        println("Saldo Atual de ${this.titular}:  ${this.saldo}")
        println("---Fim da Operação de Depósito---")
    }

    override fun trasfere(valor: Double, destino: Conta): Boolean {
        println("Transferindo da conta de ${this.titular} para a conta de ${destino.titular}")
        return if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            println("Tranferência realizada no valor de $valor")
            println("Saldo Atual de ${this.titular}: ${this.saldo}")
            println("---Fim da Operação de Transferência---")
            true
        } else {
            println("Falha na transferência")
            println("Saldo insuficiente")
            println("Saldo Atual: ${this.saldo}")
            println("---Fim da Operação de Transferência---")
            false
        }
    }

}

