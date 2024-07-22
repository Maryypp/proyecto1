package Funciones_Parametros

fun clave(clave1: String, clave2: String){
    when{
        clave1 == clave2 -> println("Las claves son iguales")
        else -> println("Las claves son diferentes")
    }
}

fun main() {
    print("Ingrese su clave:")
    val clave1 = readln()
    print("Ingrese de nuevo su clave:")
    val clave2 = readln()
    clave(clave1, clave2)
}