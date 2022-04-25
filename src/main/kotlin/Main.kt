fun main() {
    println("Bem vindo ao ByteBank")

    val contaAlex = Conta("Alex", 1000)
    contaAlex.mostraDadosConta()

    val contaFran = Conta("Fran" , 1001)
    contaFran.mostraDadosConta()

    contaFran.deposita(300.0)
    contaAlex.deposita(100.0)

    contaFran.deposita(200.0)

    contaFran.saque(300.0)

    contaFran.trasfere(50.0, contaAlex)
    //teste
    println(contaAlex.saldo)



}



