package pessoas

import enumeradores.Setor
import enumeradores.Turno
import java.math.BigDecimal

class Instalador(
    nome: String,
    cpf: String,
    idade: Int,
    var salario: BigDecimal,
    var turno: Turno,
    var motorista: Boolean,
    var setor: Setor
): Pessoa(
    nome = nome,
    cpf = cpf,
    idade = idade
)