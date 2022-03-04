package exercicio.anagrama

import src.exercicio.Anagrama
import src.exercicio.anagrama.ServiceAnagrama

class Main

fun main() {

    println("Bem vindo ao programa de Anagramas!!!")
    println("Para começarmos, digite uma palavra e lhe apresentaremos os anagrama:")
    val palavra = readLine() ?: "ola mundo"
    print(
        ServiceAnagrama().buscarAnagrama(palavra)
    )
}