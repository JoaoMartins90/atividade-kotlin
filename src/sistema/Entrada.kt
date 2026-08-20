package sistema

fun lerTexto(rotulo: String): String {
    while (true) {
        print("$rotulo: ")
        val entrada = readlnOrNull()?.trim()
        if (!entrada.isNullOrBlank()) return entrada
        println("Valor não pode ser vazio.")
    }
}


fun lerNumero(rotulo: String): Int {
    while (true) {
        print("$rotulo: ")
        val entrada = readlnOrNull()?.toIntOrNull()
        if (entrada != null && entrada > 0) return entrada
        println("Valor invalido")
    }
}

fun lerDouble(rotulo: String): Double {
    while (true) {
        print("$rotulo: ")
        val entrada = readlnOrNull()?.toDoubleOrNull()
        if (entrada != null && entrada > 0) return entrada
        println("Valor invalido")
    }
}