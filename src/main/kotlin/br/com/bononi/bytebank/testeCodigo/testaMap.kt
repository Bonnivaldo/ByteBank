package br.com.bononi.bytebank.testeCodigo

fun testaMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.00),
        Pair(2, 34.0),
        3 to 50.00
    )
    println(pedidos)
    val pedido = pedidos[1]
    pedido?.let {
        println("pedido $it")
    }
    for (pedido in pedidos) {
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos[5] = 80.00
    println(pedidos)

    pedidos[1] = 100.0
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(3, 50.0)
    println(pedidos)
}
