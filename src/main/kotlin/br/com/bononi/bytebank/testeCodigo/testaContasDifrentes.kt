import br.com.bononi.bytebank.modeloConta.*
import br.com.bononi.bytebank.modeloPerfil.Cliente
import br.com.bononi.bytebank.modeloPerfil.Endereco

fun testeContasDiferentes() {
    val alex = ContaCorrente (
        titular = Cliente(
            nome = "Alex",
            cpf = "326.236.523-55",
            sobrenome = "Velazquez",
            endereco = Endereco(logradouro = "Rua Alcantara Machado"),
            senha = 123456),
        numero = 1000)

    val fran = ContaPoupança(
        titular = Cliente(
            nome = "Fran",
            cpf = "326.236.523-55",
            sobrenome = "Andromeda",
            endereco = Endereco(logradouro = "Rua Alcantara Machado"),
            senha = 123456),
        numero = 1002)



    alex.deposita(1000.0)
    fran.deposita(1000.0)

    alex.saque(100.0)
    fran.saque(100.0)

    alex.trasfere(100.0, fran)
    fran.trasfere(100.0, alex)

}