package sistema.caixadaagua

import repositorio.JPA

fun removerCaixa() {
    val db = JPA()

    val todosIds = db.listarIds()
    print("Digite o ID da caixa que deseja remover: ")
    val id = readln().toInt()

    while (true) {
        if (id in todosIds) {
            db.remover(id)
            println("Caixa $id foi removida")
            return
        }
        print("Digite um Id existente")
        return

    }
}