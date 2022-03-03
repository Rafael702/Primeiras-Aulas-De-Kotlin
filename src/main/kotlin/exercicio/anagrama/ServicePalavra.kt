package src.exercicio.anagrama

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class ServicePalavra {
    fun listarPalavrasParaAnagrama(): Array<String> {
        val path: Path = Paths.get(
            "C:\\Users\\rafael.almeida\\Desktop\\Aulas - ZUP\\Aulas\\Aulas-Kotlin\\src\\main\\kotlin\\exercicio",
            "text.txt"
        )

        val listaDePalavras: Array<String> = Files.readAllLines(path).toTypedArray()

        return listaDePalavras
    }

    fun apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra: ArrayList<String>) =
        listaComAnagramasDaPalavra.joinToString { "\n$it" }
}