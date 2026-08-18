package produto

import pessoas.Cliente
import pessoas.Instalador
import java.math.BigDecimal
import java.time.LocalDateTime

data class Servico (
    val preco: BigDecimal? = null,
    val dataInstalacao: LocalDateTime? = null,
    val instalador: Instalador,
    var cliente: Cliente
)