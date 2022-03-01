package src.exercicio

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class Anagrama {
    fun listarPalavrasParaAnagrama(): Array<String> {
        val path: Path = Paths.get(
            "C:\\Users\\rafael.almeida\\Desktop\\Aulas - ZUP\\Aulas\\Aulas-Kotlin\\src\\main\\kotlin\\exercicio",
            "text.txt"
        )

        val listaDePalavras: Array<String> = Files.readAllLines(path).toTypedArray()

        return listaDePalavras
    }

    fun buscarAnagrama(palavra: String): String {

        val listaDePalavras: Array<String> = listarPalavrasParaAnagrama()

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
                if (anagramaValidado == anagrama) if (anagramaValidado != palavra)
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
}

