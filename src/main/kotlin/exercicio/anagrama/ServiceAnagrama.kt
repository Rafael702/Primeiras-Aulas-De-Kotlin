package src.exercicio.anagrama

import src.exercicio.Anagrama

class ServiceAnagrama {

    fun buscarAnagrama(palavra: String): String {

        val listaDePalavras: Array<String> = Anagrama().listarPalavrasParaAnagrama()
        val palavraComLetrasMaiuscula = palavra.uppercase()

        palavraComLetrasMaiuscula.forEach {
            val anagrama: String = verificarPalavraNaListaDeAnagrama(
                listaDePalavras, it, palavraComLetrasMaiuscula.uppercase()
            )
            val temAnagrama: Boolean = anagrama.isNotEmpty()
            if (temAnagrama) {
                return "O Anagrama de ${palavra.uppercase()} É: $anagrama"
            }
        }

        return "Nao Foi Encontrado Anagrama Para Esta Palavra"
    }

    fun verificarPalavraNaListaDeAnagrama(listaDePalavras: Array<String>, caracterDePalavra: Char, palavra: String):
            String {

        var anagramaFormado: String = ""

        listaDePalavras.forEach {
            val anagramaComValidacao = ValidaAnagrama().validarAnagrama(it, caracterDePalavra, palavra)
            if (anagramaComValidacao.isNotEmpty()) {
                anagramaFormado += anagramaComValidacao
            }
        }

        return anagramaFormado
    }

    fun apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra: ArrayList<String>) =
        listaComAnagramasDaPalavra.joinToString { "\n$it" }
}