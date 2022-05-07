fun main() {
    println("Inicio Main")
    funcao1()
    println("Fim Main")
}

fun funcao1() {
    println("Inicio função1")
    funcao2()
    println("Fim função2")
}

fun funcao2() {
    println("Inicio função2")
    for (i in 1..5){
        println(i)
    }
    println("Fim função2")
}
