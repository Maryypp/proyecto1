package Funciones_con_retorno

fun peri(ladop: Int): Int {
    val pr = ladop*4
    return pr
}
fun main() {
    print("Ingrese el valor del lado del cuadrado:")
    val lado = readln().toInt()
    print("El perimetro del cuadrado es:" +
            "${peri(lado)}")
}