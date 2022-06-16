package br.com.bononi.bytebank.brinks

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
//    nomesSalvos.add("Paulo")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    companion object {
        private val dados = mutableListOf<String>()
    }

    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }
}

fun testaColecao(){
    val nomes: MutableCollection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in nomes.iterator()){
        println(nome)
    }
    println(nomes)
    nomes.add("Paulo")
    nomes.remove("Alex")
    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção: ${nomes.size}")
}