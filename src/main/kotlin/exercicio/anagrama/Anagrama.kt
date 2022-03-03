package src.exercicio

import src.exercicio.anagrama.ServiceAnagrama
import src.exercicio.anagrama.ValidaAnagrama

class Anagrama {

    fun buscarAnagrama(palavra: String): String {

        val listaDePalavras: Array<String> = ServiceAnagrama().listarPalavrasParaAnagrama()
        val palavraComLetrasMaiuscula = palavra.uppercase()

        palavraComLetrasMaiuscula.forEach { i ->
            val anagrama: String = verificarPalavraNaListaDeAnagrama(
                listaDePalavras, i, palavraComLetrasMaiuscula.uppercase()
            )
            val temAnagrama: Boolean = anagrama.isNotEmpty()
            if (temAnagrama) {
                return "O Anagrama de ${palavra.uppercase()} É: $anagrama"
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
            val anagramaComValidacao = ValidaAnagrama().validarAnagrama(
                anagrama, caracterDePalavra, palavra,
                anagramaASerPreenchido
            )
            when {
                anagramaComValidacao.isNotEmpty() -> {
                    anagramaFormado += anagramaComValidacao
                }
            }
        }
        return anagramaFormado
    }

    /*
    Core
          Servico {Orquestrador}
          Validadores {Cadastro de cliente = ValidarOCEP, validar Pessoa.validador}
          repositorio

     */
}