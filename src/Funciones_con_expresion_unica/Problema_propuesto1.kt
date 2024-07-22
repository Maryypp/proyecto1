package Funciones_con_expresion_unica

fun promedioo(val1: Int, val2: Int,val3: Int) = (val1+val2+val3)/3
fun main() {
    print("Ingrese el primer numero:")
    val nu = readln().toInt()
    print("Ingrese el segundo numero:")
    val num = readln().toInt()
    print("Ingrese el tercer numero:")
    val nume = readln().toInt()
    println("El promedio de estos numeros es: " +
            "${promedioo(nu, num, nume)}")
}