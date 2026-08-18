package enumeradores

enum class Cor(private val descricao: String) {

    AZUL("Azul"),
    ROXO("Roxo"),
    VERDE("Verde"),
    AMARELO("Amarelo"),
    VERMELHO("Vermelho");

    override fun toString() = descricao
}