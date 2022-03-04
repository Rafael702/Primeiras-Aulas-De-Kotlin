package src.exercicio.anagrama

import src.exercicio.Anagrama

class ServiceAnagrama {

    fun pegarPalavraInseridaPeloUsuario(): String? {
        println("Bem vindo ao programa de Anagramas!!!")
        println("Para começarmos, digite uma palavra e lhe apresentaremos os anagrama:")
        val palavra = readLine()

        return palavra?.let { buscarAnagrama(it.uppercase()) }
    }

    fun buscarAnagrama(palavra: String): String {

        val listaDePalavras: Array<String> = Anagrama().listarPalavrasParaAnagrama()

        return palavra.map {
            verificarPalavraNaListaDeAnagrama(listaDePalavras, it, palavra)
        }.joinToString { it }
            .ifEmpty { "Nao Foi Encontrado Anagrama Para Esta Palavra" }

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