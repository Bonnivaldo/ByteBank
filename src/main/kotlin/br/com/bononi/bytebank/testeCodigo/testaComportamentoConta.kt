import br.com.bononi.bytebank.exception.FalhaAutenticacao
import br.com.bononi.bytebank.exception.SaldoInsuficienteException
import br.com.bononi.bytebank.funcionamentoInterno.MostraDados
import br.com.bononi.bytebank.modeloConta.*
import br.com.bononi.bytebank.modeloPerfil.Cliente
import br.com.bononi.bytebank.modeloPerfil.Endereco

fun testaComportamentoConta() {
    
    val alex = Cliente(nome = "Alex", cpf = "326.236.523-55", sobrenome = "Velazquez", endereco = Endereco(), senha = 123456)
    val fran = Cliente(nome = "Fran", cpf = "326.236.523-55", sobrenome = "Andromeda", endereco = Endereco(), senha = 123456)
    val douglas = Cliente(nome = "Douglas", cpf = "326.236.523-55", sobrenome = "Andromeda", endereco = Endereco(), senha = 123456)


    val contaAlex = ContaCorrente(alex, 1000)
    MostraDados(contaAlex)

    val contaFran = ContaCorrente(fran, 1001)
    MostraDados (contaFran)

    val contaDouglas = ContaSalario(douglas, 1002)
    MostraDados (contaDouglas)

    contaFran.deposita(300.0)
    contaAlex.deposita(100.0)
    contaDouglas.deposita(100.0)

//    try {
//        contaFran.saque(400.0)
//    } catch (e: SaldoInsuficienteException) {
//        println("SaldoInsuficienteExcepton foi pegada")
//        e.printStackTrace()
//    } catch (e: FalhaAutenticacao){
//        println("Falha na Autenticação")
//        println("Senha incorreta")
//        e.printStackTrace()
//    }catch (e: Exception){
//        println("Falha desconhecida")
//        e.printStackTrace()
//    }

    contaFran.trasfere(50.0, contaAlex)
    //teste

}