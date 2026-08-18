package pessoas

import java.math.BigDecimal

class Cliente(
    nome: String,
    cpf: String,
    idade: Int,
    var dividasAbertas: Boolean,
    var parcelasAPagar: MutableList<BigDecimal>
): Pessoa(
    nome = nome,
    cpf = cpf,
    idade = idade,
)

