package Arreglos

fun main(){
    val sueldos: IntArray
    sueldos = IntArray(5)
    //carga de sus elemetos por teclado
    for (i in 0..4) {
        print("Ingrese sueldo:")
        sueldos[i] = readln().toInt()
    }
    //Impresion de sus elemetos
    for (i in 0..4){
        println(sueldos[i])
    }
}