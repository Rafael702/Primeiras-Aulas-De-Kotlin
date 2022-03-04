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

        return Files.readAllLines(path).toTypedArray()
    }

    /*
    Core
          Servico {Orquestrador}
          Validadores {Cadastro de cliente = ValidarOCEP, validar Pessoa.validador}
          repositorio

     */
}