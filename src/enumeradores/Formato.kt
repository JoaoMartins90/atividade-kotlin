package enumeradores

enum class Formato(private val descricao: String) {

    QUADRADA("Quadrada"),
    REDONDO("Redondo"),
    TRIANGULAR("Triangular"),
    PEIXE("Peixe");

    override fun toString() = descricao
}