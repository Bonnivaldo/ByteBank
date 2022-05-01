abstract class Conta(val titular: String, val numero: Int) {

    abstract fun mostraDadosConta()

    abstract fun deposita(valor: Double)

    abstract fun saque(valor: Double = 0.0)

    abstract fun trasfere(valor: Double, destino: Conta): Boolean

}