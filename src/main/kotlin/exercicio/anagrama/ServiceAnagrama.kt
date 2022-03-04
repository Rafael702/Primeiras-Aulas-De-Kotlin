package src.exercicio.anagrama

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class ServiceAnagrama {
    fun listarPalavrasParaAnagrama(): Array<String> {
        val path: Path = Paths.get(
            "C:\\Users\\rafael.almeida\\Desktop\\Aulas - ZUP\\Aulas\\Aulas-Kotlin\\src\\main\\kotlin\\exercicio",
            "text.txt"
        )

        return Files.readAllLines(path).toTypedArray()
    }

    fun apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra: ArrayList<String>) =
        listaComAnagramasDaPalavra.joinToString { "\n$it" }
}