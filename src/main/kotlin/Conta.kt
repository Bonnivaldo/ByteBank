class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        println("Depositando na conta do ${this.titular}")
        this.saldo += valor
        println("Saldo Atual ${this.saldo}")
    }

    fun saque(valor: Double = 0.0) {
        println("Sacando na conta de ${this.titular}")
        if (saldo >= valor) {
            saldo -= valor
            println("Saque realizado no valor de $valor")
            println("Saldo Atual: ${this.saldo}")
        } else {
            println("Saldo insuficiente para o saque")
            println("Saldo Atual: ${this.saldo}")
        }
    }

    fun mostraDadosConta() {
        println("Titular da Conta ${this.titular}")
        println("Numero da Conta ${this.numero}")
        println("Saldo Atual: ${this.saldo}")
    }

    fun trasfere(valor: Double, destino: Conta): Boolean {
        println("Transferindo da conta de ${this.titular} para a conta de ${destino.titular}")
        return if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            println("Tranferência realizada no valor de $valor")
            println("Saldo Atual: ${this.saldo}")
            true
        } else {
            println("Falha na transferência")
            println("Saldo insuficiente")
            println("Saldo Atual: ${this.saldo}")
            false
        }
    }

}