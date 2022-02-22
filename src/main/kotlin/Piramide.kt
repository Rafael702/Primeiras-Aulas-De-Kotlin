package src

/*
1$1
2##$##2
3###$###3
*/

fun imprimirCaracteresEspecialAteONumeroLimite(numeroLimite: Int) {
    for (contador in 1..2) {
        for (a in 1..numeroLimite) {
            print("#")
        }
        if (contador <= 1) {
            print("$")
        }
    }
}

fun main() {
    for (i in 1..50) {
        print(i)
        if (i > 1) {
            imprimirCaracteresEspecialAteONumeroLimite(i)
        } else {
            print("$")
        }
        println(i)
    }
}
