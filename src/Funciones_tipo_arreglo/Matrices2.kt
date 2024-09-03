package Funciones_tipo_arreglo

import Modificadores_private_y_public.Arreg

/*
Ejercicio 1: Suma de dos matrices
Escribe un programa en Kotlin que tome dos matrices de
enteros de las mismas dimensiones y calcule su suma.
El programa debe mostrar la matriz resultante.

Instrucciones:

1. Define en el main dos matrices de enteros
(por ejemplo, de tamaño 3x3).
2. Metodo que sume las matrices elemento por
elemento y reciba por parametro las filas,
las columnas, y ambas matrices.
3. Metodo que recibe e imprime la matriz resultante.
*/

 fun sumarMatriz(
     filas: Int, columnas: Int, matriz1: Array<IntArray>,
     matriz2: Array<IntArray>
 ): Array<IntArray>{
     val result = Array(filas) { IntArray(columnas)}

     for (f in 0 until filas){
         for (c in 0 until columnas) {
             result[f][c] = matriz1[f][c] + matriz2[f][c]
         }
     }
     return result
 }
fun imprimirMatriz(matriz: Array<IntArray>) {
    println("Matriz resultante:")
    for (valores in matriz){
        println(valores.joinToString(" "))
    }
}
fun main(){
    val filas = 3 //cantidad de filas
    val columnas = 3 //cantidad de columnas

    val matriz1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    val matriz2 = arrayOf(
        intArrayOf(9, 8, 7),
        intArrayOf(6, 5, 4),
        intArrayOf(3, 2, 1)
    )
    var result = sumarMatriz(filas, columnas, matriz1, matriz2)
    imprimirMatriz(result)
}