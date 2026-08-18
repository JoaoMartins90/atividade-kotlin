package enumeradores

enum class Material(private val descricao: String) {

    POLIETILENO("Polietileno"),
    COBRE("Cobre"),
    CONCRETO("Concreto"),
    FIBRA_DE_VIDRO("Fibra de Vidro"),
    ACO_INOXIDAVEL("Aco Inoxidavel");

    override fun toString() = descricao
}