package sistema

import sistema.caixadaagua.cadastrarNovaCaixa
import sistema.caixadaagua.listarCaixa
import sistema.caixadaagua.removerCaixa

fun menuInicial() {


    do {
        println("0 - SAIR")
        println("1 - CADASTRAR CAIXA DE AGUA")
        println("2 - REMOVER CAIXA DE AGUA")
        println("3 - ALTERAR CAIXA DE AGUA")
        println("4 - LISTAR CAIXA DE AGUA")

        val op = readln()

        when(op){
            "0" -> {
                println("Sistema encerrado")
                break
            }
            "1" -> cadastrarNovaCaixa()
            "2" -> removerCaixa()
            "3" -> println("")
            "4" -> listarCaixa()
            else -> println("Opção inválida!")

        }
    } while(true)
}