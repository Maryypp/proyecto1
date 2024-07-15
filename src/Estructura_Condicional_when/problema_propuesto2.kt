package Estructura_Condicional_when
fun main () {
    var mayor = 0
    for (i in 1 .. 5) {
        println("Ingrese el primer valor: ")
        val valor1 = readln().toInt()
        println("Ingrese el segundo valor: ")
        val valor2 = readln().toInt()
        println("Ingrese el tercer valor: ")
        val valor3 = readln().toInt()
        mayor += when {
            valor1 > valor2 && valor1 > valor3 -> valor1
            valor2 > valor1 && valor2 > valor3 -> valor2
            else -> valor3

        }
    }
        println("El mayor de esta lista es: $mayor")


}
