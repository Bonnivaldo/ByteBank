package br.com.bononi.bytebank.brinks

class Prateleira(
    val genero: String,
    val livros: MutableList<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizarPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}