package enumeradores

enum class Setor(private val descricao: String) {

    INSTALACAO("Instalacao"),
    FINANCEIRO("Financeiro"),
    LOGISTICA("Logistica"),
    ADMINISTRACAO("Administracao");

    override fun toString() = descricao
}