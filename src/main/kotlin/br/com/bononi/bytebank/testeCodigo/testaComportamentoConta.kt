import br.com.bononi.bytebank.modeloConta.*
import br.com.bononi.bytebank.modeloPerfil.Cliente
import br.com.bononi.bytebank.modeloPerfil.Endereco

fun testaComportamentoConta() {
    
    val alex = Cliente(nome = "Alex", cpf = "326.236.523-55", sobrenome = "Velazquez", endereco = Endereco(), senha = 123456)
    val fran = Cliente(nome = "Fran", cpf = "326.236.523-55", sobrenome = "Andromeda", endereco = Endereco(), senha = 123456)

    val contaAlex = ContaCorrente(alex, 1000)
    contaAlex.mostraDadosConta()

    val contaFran = ContaPoupança(fran, 1001)
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