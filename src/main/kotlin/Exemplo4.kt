package src

//:Unit -> Nao tem retorno

fun printMessage(message: String) {
    println(message)
}//Apresentar mensagem

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}//Parametro com valor padrao.

fun sum(x: Int, y: Int): Int {
    return x + y
}//Metodo de soma.

fun multiply(x: Int, y: Int) = x * y
//Metodo de multiplicacao


fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello") // prefix = Info
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}