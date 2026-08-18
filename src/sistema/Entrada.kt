package sistema

fun lerTexto(rotulo: String): String {
    while (true) {
        print("$rotulo: ")
        val entrada = readlnOrNull()?.trim()
        if (!entrada.isNullOrBlank()) return entrada
        println("Valor não pode ser vazio.")
    }
}


fun lerNumero(rotulo: String): String {
    while (true) {
        print("$rotulo: ")
        val entrada = readlnOrNull()?.trim()
        if (!entrada.isNullOrBlank()) return entrada
        println("Valor não pode ser vazio.")
    }
}