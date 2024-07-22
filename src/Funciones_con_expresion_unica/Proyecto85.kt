package Funciones_con_expresion_unica

import Funciones_con_retorno.retornarMayor

fun retornarSuperficie(lado: Int)= lado*lado

fun main() {
    print("Ingrese el valor del lado del cuadrado:")
    val la = readln().toInt()
    println("La superficie del cuadrado es ${retornarSuperficie(la)}")
}