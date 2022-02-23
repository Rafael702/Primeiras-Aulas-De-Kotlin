package src.exercicio


fun buscarAnagrama(palavra: String): String {

    val listaDePalavras: Array<String> = arrayOf("ROMA", "SAL", "COBRA", "BROCA")

    palavra.forEach { i ->
        val anagrama: String = verificarPalavraNaListaDeAnagrama(listaDePalavras, i, palavra)
        val temAnagrama: Boolean = anagrama.isNotEmpty()
        if (temAnagrama) {
            return "O Anagrama de $palavra É: $anagrama"
        }
    }

    return "Nao Foi Encontrado Anagrama Para Esta Palavra"
}

fun verificarPalavraNaListaDeAnagrama(
    listaDePalavras: Array<String>,
    caracterDePalavra: Char,
    palavra: String
): String {
    var anagramaFormado: String = ""

    listaDePalavras.forEach { anagrama ->
        val anagramaASerPreenchido: String = ""
        val anagramaComValidacao = validarAnagrama(anagrama, caracterDePalavra, palavra, anagramaASerPreenchido)
        when {
            anagramaComValidacao.isNotEmpty() -> {
                anagramaFormado += anagramaComValidacao
            }
        }
    }
    return anagramaFormado
}

fun validarAnagrama(anagrama: String, caracterDePalavra: Char, palavra: String, anagramaFormado: String): String {
    val listaComAnagramasDaPalavra: ArrayList<String> = arrayListOf()

    var anagramaValidado = anagramaFormado

    anagrama.forEach { a ->
        if (anagrama.contains(caracterDePalavra)) if (palavra.contains(a)) {
            anagramaValidado += a
            if (anagramaValidado == anagrama)
                listaComAnagramasDaPalavra.add(anagramaValidado)
        }
    }
    return apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra)
}

fun apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra: ArrayList<String>): String {
    var anagramasDaLista: String = ""

    listaComAnagramasDaPalavra.forEach { anagramas ->
        anagramasDaLista += "\n$anagramas"
    }
    return anagramasDaLista
}

fun main() {

    val palavra = "Barco"

    println(buscarAnagrama(palavra.uppercase()))

    println("FIm")

}