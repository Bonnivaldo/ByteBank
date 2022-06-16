fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 40.0),
        Pedido(3, 50.0),
        Pedido(4, 75.0),
        Pedido(5, 100.0)
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])


//    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
//        pedido.valor > 50.0
//    }
//
//    println(pedidosFreteGratis)
//    println(pedidosFreteGratis[Pedido(1, 20.0)])

    val pedidosFreteGratis = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
    println(pedidosFreteGratis[true])

}


data class Pedido(val numero: Int, val valor: Double)








