package Funciones_tipo_arreglo

fun main(){
    var matriz = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9),
        intArrayOf(10,11,12,13,14),
    )
    println(matriz[0][0]) // regresa 1, las filas y las columnas comienzan desde 0
    println(matriz[0][2]) // regresa 3
   // println(matriz[0][3]) // ERROR
}
fun recorrerMatriz1(matriz: Array<IntArray>){
    for (fila in (0 until matriz.size)){
        println()
        for (columna in (0 until matriz[fila].size))
            println("Posicion[$fila][columna] " +
                    "${matriz[fila][columna]}" )
    }
}
fun recorrerMatriz2(matriz: Array<IntArray>){
    for(f in matriz.indices){
        println()
        for (c in matriz.indices)
            println("Posicion[$f][$c] : ${matriz[f][c]}")
    }
}