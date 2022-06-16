package br.com.bononi.bytebank.testeCodigo

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.00),
        Pair(2, 34.0),
        3 to 50.00,
        4 to 90.00,
        5 to 150.0,
        6 to 80.0
    )
//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    val message = pedidos.getOrElse(0) { "Não tem pedido" }
    println(message)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("Número: $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        "Valor do pedido: $valor"
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 20.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)
    println(pedidos + Pair(7, 90.0))
    println(pedidos)

    println(pedidos + mapOf(8 to 500))
    println(pedidos)

    pedidos.putAll(setOf(7 to 90.00, 8 to 200.0))
    pedidos += listOf<Pair<Int, Double>>(9 to 100.00)
    println(pedidos)

    pedidos -= 6

    println(pedidos)
}