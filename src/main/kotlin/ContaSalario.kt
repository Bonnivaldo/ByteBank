class ContaSalario(
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

    override fun trasfere(valor: Double, destino: Conta): Boolean {
        println("Sua modalidade de conta não permite transferências")
        return false
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

}

