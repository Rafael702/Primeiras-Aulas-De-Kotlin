package src.exercicio.anagrama

class ValidaAnagrama {

    fun validarAnagrama(anagrama: String, caracterDePalavra: Char, palavra: String, anagramaFormado: String): String {
        val listaComAnagramasDaPalavra: ArrayList<String> = arrayListOf()

        var anagramaValidado = anagramaFormado

        anagramaValidado += anagrama.filter { a -> anagrama.contains(caracterDePalavra) && palavra.contains(a) }

        if (anagramaValidado == anagrama)
            if (anagramaValidado != palavra) {
                listaComAnagramasDaPalavra.add(anagramaValidado)
            }

        return ServiceAnagrama().apresentarAnagramasDaPalavra(listaComAnagramasDaPalavra)
    }


}