package sistema.caixadaagua

import repositorio.JPA

fun removerCaixa() {

    println("Digite o ID da caixa que deseja remover: ")
    val id = readln().toInt()

    val db = JPA()

    db.remover(id)

    println("Caixa $id foi removida")
}