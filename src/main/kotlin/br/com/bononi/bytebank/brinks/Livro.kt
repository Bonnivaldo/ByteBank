package br.com.bononi.bytebank.brinks

data class Livro (
    val titulo: String,
    val autor: String,
    val anoPublicacao: Int,
    val editora: String? = null
): Comparable<Livro> {
    override fun compareTo(other: Livro): Int {
        return this.anoPublicacao.compareTo(other = other.anoPublicacao)
    }
}