package produto

import enumeradores.Cor
import enumeradores.Formato
import enumeradores.Material
import java.math.BigDecimal

data class CaixaDaAgua(
    val id: Int? = null,
    val marca: String,
    val modelo: String,
    val cor: Cor,
    val material: Material,
    val formato: Formato,
    val preco: BigDecimal,
    val altura: Double,
    val largura: Double,
    val profundidade: Double
)