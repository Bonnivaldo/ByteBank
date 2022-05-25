package br.com.bononi.bytebank.brinks


    fun List<Livro?>.imprimeComMarcadores() {
        val textoFormatado = this
            .filterNotNull()
            .joinToString(separator = "\n") {
                " - ${it.titulo} de ${it.autor}"
            }
        println(" #### Lista de Livros #### \n$textoFormatado")
    }

    fun livrosComAtributoNulo() {
        listaDeLivros
            .groupBy { it.editora ?: "Editora desconhecida" }
            .forEach { (editora: String, livros: List<Livro>) ->
                println("$editora: ${livros.joinToString { it.titulo }}")
            }
    }
