package src.exercicio.anagrama

import src.exercicio.Anagrama

class ServiceAnagrama {

    fun buscarAnagrama(palavra: String): String {

        val listaDePalavras: Array<String> = Anagrama().listarPalavrasParaAnagrama()
        val palavraComLetrasMaiuscula = palavra.uppercase()

        return palavraComLetrasMaiuscula.map {
            verificarPalavraNaListaDeAnagrama(listaDePalavras, it, palavraComLetrasMaiuscula)
        }.joinToString { it }.ifEmpty { "Nao Foi Encontrado Anagrama Para Esta Palavra" }

    }

    fun verificarPalavraNaListaDeAnagrama(listaDePalavras: Array<String>, caracterDePalavra: Char, palavra: String):
            String {

        var anagramaFormado: String = ""

        listaDePalavras.map {
            if (ValidaAnagrama().validarAnagrama(it, caracterDePalavra, palavra).isNotEmpty())
                anagramaFormado += "\n" + it
        }

        return anagramaFormado
    }

    fun apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra: ArrayList<String>) =
        listaComAnagramasDaPalavra.joinToString { "\n$it" }
}