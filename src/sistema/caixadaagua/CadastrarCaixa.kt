package sistema.caixadaagua

import enumeradores.Cor
import enumeradores.Formato
import enumeradores.Material
import produto.CaixaDaAgua
import repositorio.JPA
import sistema.lerDouble
import sistema.lerNumero
import sistema.lerTexto

fun cadastrarNovaCaixa() {

    val instalador = lerTexto("Digite o Instalador")

    val fornecedor = lerTexto("Digite o Fornecedor")

    val marca = lerTexto("Digite a Marca")

    val modelo = lerTexto("Digite o Modelo")

    println("Cores: ")
    Cor.entries.forEach {
        println("${it.ordinal} - $it")
    }
    val cor = lerNumero("Digite o n° da Cor")

    println("Materiais: ")
    Material.entries.forEach {
        println("${it.ordinal} - $it")
    }
    val material = lerNumero("Digite o n° Material")

    println("Formatos: ")
    Formato.entries.forEach {
        println("${it.ordinal} - $it")
    }
    val formato = lerNumero("Digite o n° Formato")

    println("Digite o preço: ")
    val preco = readln().toBigDecimal()

    val altura = lerDouble("Digite a Altura")

    val largura = lerDouble("Digite a Largura")

    val profundidade = lerDouble("Digite a Profundidade")

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