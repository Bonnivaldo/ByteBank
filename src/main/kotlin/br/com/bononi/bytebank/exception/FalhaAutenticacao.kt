package br.com.bononi.bytebank.exception

class FalhaAutenticacao(
    mensagem: String = "Falha na Autenticação"
): Exception(mensagem)