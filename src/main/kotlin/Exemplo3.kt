package src

fun main(){
    var neverNull: String = "This can't be null"

//    neverNull = null  Erro de compilacao( Null can not be a value of a non-null type String), String nao pode ser nula

    var nullable: String? = "You can keep a null here"
    //O simbolo ? permite valor null

    nullable = null

    var inferredNonNul = "The compiler assumes non-null"

//    inferredNonNul = null Erro de compilacao ( Null can not be a value of a non-null type String),  String nao pode ser nula

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
    if(nullable != null){ //Metodo so recebe String e não valores nulos.
        strLength(nullable)
    }

}


