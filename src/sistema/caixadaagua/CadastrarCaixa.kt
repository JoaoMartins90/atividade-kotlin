package sistema.caixadaagua

import enumeradores.Cor
import enumeradores.Formato
import enumeradores.Material
import produto.CaixaDaAgua
import repositorio.JPA
import sistema.lerTexto

fun cadastrarNovaCaixa() {

    val instalador = lerTexto("Digite o Instalador")

    val fornecedor = lerTexto("Digite o Fornecedor")

    val marca = lerTexto("Digite a marca")

    val modelo = lerTexto("Digite a modelo")

    println("Cores: ")
    Cor.entries.forEach {
        println("${it.ordinal} - $it")
    }
    println("Numero da cor: ")
    val cor = readln().toInt()

    println("Materiais: ")
    Material.entries.forEach {
        println("${it.ordinal} - $it")
    }
    println("Numero do material: ")
    val material = readln().toInt()

    println("Formatos: ")
    Formato.entries.forEach {
        println("${it.ordinal} - $it")
    }
    println("Numero do formato: ")
    val formato = readln().toInt()

    println("Digite o preço: ")
    val preco = readln().toBigDecimal()

    println("Digite a altura: ")
    val altura = readln().toDouble()

    println("Digite a largura: ")
    val largura = readln().toDouble()

    println("Digite a profundidade: ")
    val profundidade = readln().toDouble()

    val db = JPA()
    val id = db.salvar(
        CaixaDaAgua(
            marca = marca,
            modelo = modelo,
            cor = Cor.entries[cor],
            material = Material.entries[material],
            formato = Formato.entries[formato],
            preco = preco,
            altura = altura,
            largura = largura,
            profundidade = profundidade
        )
    )
    if (id != null)
        println("Caixa registrada com o id $id")
    else
        println("Não foi possivel registrara caixa"
        )
}