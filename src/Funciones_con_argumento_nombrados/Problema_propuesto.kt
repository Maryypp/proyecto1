package Funciones_con_argumento_nombrados

fun tablaMulti(numero: Int, termino: Int = 10) {
    println("La tabla de multiplicacion del numero $numero hasta el termino $termino es:  ")
    for (i in 1..termino){
        println("$numero x $i = ${numero * i}")

}


}

fun main() {
    tablaMulti(numero = 3)
    tablaMulti(numero = 3, termino = 5)
}