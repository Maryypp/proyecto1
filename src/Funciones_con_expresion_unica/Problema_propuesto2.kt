package Funciones_con_expresion_unica

fun periCuadri(lad: Int) = lad*4
fun main() {
    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readln().toInt()
    print("El perimetro de este cuadrado es: " +
            "${periCuadri(lado)}")
}