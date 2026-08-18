package sistema.caixadaagua

import produto.CaixaDaAgua
import repositorio.JPA
import java.text.NumberFormat
import java.util.Locale

fun listarCaixa() {

    val db = JPA()

    val formatador = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"))

    val caixaDaAgua: List<CaixaDaAgua> = db.listar()

    caixaDaAgua.forEach { c ->
        println("""
            Id: ${c.id}
            Marca: ${c.marca}
            Cor: ${c.cor}
            Material: ${c.material}
            Formato: ${c.formato}
            Preco: ${formatador.format(c.preco)}
            Altura: ${c.altura}
            Largura: ${c.largura}
            Profundidade: ${c.profundidade}
        """.trimIndent()
        )
    }
}