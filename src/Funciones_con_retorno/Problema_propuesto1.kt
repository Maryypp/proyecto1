package Funciones_con_retorno

fun retornarPromedio(val1: Int, val2: Int, val3: Int): Int {
    val pro = (val1+val2+val3)/3
    return pro
}
fun main() {
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val valor3 = readln().toInt()
    print("El valor promedio de los valores es: " +
            "${retornarPromedio(valor1, valor2, valor3)}")
}