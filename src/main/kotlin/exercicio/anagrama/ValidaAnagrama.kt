package src.exercicio.anagrama

class ValidaAnagrama {

    fun validarAnagrama(anagrama: String, caracterDePalavra: Char, palavra: String): String {
        val listaComAnagramasDaPalavra: ArrayList<String> = arrayListOf()

        var anagramaValidado = ""

        anagramaValidado += anagrama.filter { a -> anagrama.contains(caracterDePalavra) && palavra.contains(a) }

        if (verificarSeAnagramaValidadoEstaNaLista(anagramaValidado, anagrama, palavra)) {
            listaComAnagramasDaPalavra.add(anagramaValidado)
        }

        return ServiceAnagrama().apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra)
    }


    /* Funcao Verifica se o anagrama que foi validado esta de acordo com o anagrama da lista de palavras */
    fun verificarSeAnagramaValidadoEstaNaLista(anagramaValidado: String, anagrama: String, palavra: String) =
        run { anagramaValidado == anagrama && anagramaValidado != palavra }

}