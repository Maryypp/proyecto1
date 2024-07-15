package Estructura_Condicional_when
fun main () {
    print("Ingrese un valor: ")
    val valor = readln().toInt()
    when {
        valor > 0 -> println("Numero entero")
        valor < 0 -> println("Numero negativo")
        else -> println("Numero nulo")

    }





}
