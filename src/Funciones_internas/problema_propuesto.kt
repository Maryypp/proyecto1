package Funciones_internas

fun mayorS() {
    fun mayor(val1: Int, val2: Int) = if (val1 > val2) val1 else val2
    for (i in 1..5){
        print("Ingrese el primer valor: ")
        val unn = readln().toInt()
        print("Ingrese el segundo valor: ")
        val nume = readln().toInt()
        println("El mayor entre $unn y $nume es: ${mayor(unn,nume)}")


        }
    }


fun main() {
    mayorS()
}