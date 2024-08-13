package Constructores

class Triangulo2 (var lado1: Int, var lado2: Int, var lado3: Int) {

    constructor() : this(0, 0, 0) {
        println("Ingrese el primer lado:")
        lado1 = readln().toInt()
        println("Ingrese el segundo lado:")
        lado2 = readln().toInt()
        println("Ingrese el tercer lado:")
        lado3 = readln().toInt()
    }

    fun ladoMayor() {
        print("Lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }
        fun esEquilatero() {

            if (lado1 == lado2 && lado1 == lado3)
                println("Es un triangulo equilatero")
            else
                println("No es un triangulo equilatero")
        }
    }

fun main() {
    val triangulo1 = Triangulo2()
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()

    val triangulo2 = Triangulo2(6,6,6)
    triangulo2.ladoMayor()
    triangulo2.esEquilatero()
}