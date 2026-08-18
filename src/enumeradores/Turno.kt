package enumeradores

enum class Turno(private val descricao: String) {

    MANHA("Manha"),
    TARDE("Tarde"),
    NOITE("Noite");

    override fun toString() = descricao
}