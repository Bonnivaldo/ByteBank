fun testeContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupança = ContaPoupança(
        titular = "Fran",
        numero = 1005
    )

    contaCorrente.deposita(1000.0)
    contaPoupança.deposita(1000.0)

    contaCorrente.saque(100.0)
    contaPoupança.saque(100.0)

    contaCorrente.trasfere(100.0, contaPoupança)
    contaPoupança.trasfere(100.0, contaCorrente)

}