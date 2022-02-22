package src.exercicio

fun validarNumerosQueSaoOuNaoPotenciasDeDois(numeroLimite: Long) {
    var expoenteFinal: Int = 0
    val expoente = 0

    for (i in expoente..numeroLimite) {
        val resultado = calculoDePotencia(i.toInt())

        if (resultado == numeroLimite) {
            imprimirNumerosQueSaoPotenciasDeDois(numeroLimite, expoenteFinal)
            break
        } else if (i == numeroLimite) {
            imprimirNumerosQueNaoSaoPotenciasDeDois(numeroLimite)
            break
        }
        expoenteFinal += 1
    }
}

fun calculoDePotencia(expoente: Int): Long {
    return Math.pow(2.toDouble(), expoente.toDouble()).toLong()
}

fun imprimirNumerosQueSaoPotenciasDeDois(numeroLimite: Long, expoenteFinal: Int) {
    print(numeroLimite)
    print(" " + true + " ")
    println(expoenteFinal)
}

fun imprimirNumerosQueNaoSaoPotenciasDeDois(numeroLimite: Long) {
    print(numeroLimite)
    println(" " + false)
}

fun main() {

    var listaDeNumeros = listOf(1, 140, 128, 137, 65535, 65536, 17179869184)

    for (numeroDaLista in listaDeNumeros) {
        validarNumerosQueSaoOuNaoPotenciasDeDois(numeroDaLista)
    }

}

