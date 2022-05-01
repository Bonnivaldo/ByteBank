fun testaComportamentoConta() {

    val contaAlex = ContaCorrente("Alex", 1000)
    contaAlex.mostraDadosConta()

    val contaFran = ContaPoupança("Fran", 1001)
    contaFran.mostraDadosConta()

    val contaDouglas = ContaSalario("Fran", 1002)
    contaDouglas.mostraDadosConta()

    contaFran.deposita(300.0)
    contaAlex.deposita(100.0)
    contaDouglas.deposita(100.0)

    contaDouglas.saque(300.0)

    contaDouglas.trasfere(50.0, contaAlex)
    //teste

}