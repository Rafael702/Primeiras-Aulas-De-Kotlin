package src.exercicio.anagrama

class ValidaAnagrama {

    fun validarAnagrama(anagrama: String, caracterDePalavra: Char, palavra: String, anagramaFormado: String): String {
        val listaComAnagramasDaPalavra: ArrayList<String> = arrayListOf()

        var anagramaValidado = anagramaFormado

        anagramaValidado += anagrama.filter { a -> anagrama.contains(caracterDePalavra) && palavra.contains(a) }

        if (verificarSeAnagramaValidadoEstaNaLista(anagramaValidado, anagrama, palavra)) {
            listaComAnagramasDaPalavra.add(anagramaValidado)
        }

        return ServiceAnagrama().apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra)
    }


    //* Funcao Verifica se o angrama que foi validado esta de acordo com o anagrama da lista de palavras
    fun verificarSeAnagramaValidadoEstaNaLista(anagramaValidado: String, anagrama: String, palavra: String) =
        run { anagramaValidado == anagrama && anagramaValidado != palavra }

}