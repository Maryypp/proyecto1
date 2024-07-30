package Arreglos

import kotlin.random.Random

fun main() {

    val num1: IntArray
     num1 = IntArray(4)
    val num2: IntArray
    num2 = IntArray(4)
    val total: IntArray
    total = IntArray(4)


    for (i in 0..num1.size -1){
        print("Ingrese un valor del primer arreglo: ")
        num1[i]= readln().toInt()

    }


    for (i in 0..num2.size -1) {
        print("Ingrese un valor del segundo arreglo: ")
        num2[i] = readln().toInt()

    }

    for (i in 0..num1.size -1) {
        total[i] = num1[i] + num2[i]
        println("La suma de ${(num1[i])} y ${(num2[i])} es : ${(total[i])}")
    }


    /*
    val arreglo1: IntArray
    arreglo1 = IntArray(4)
    var arreglo2 = IntArray(4)
    val arreglosuma = IntArray(4)

    var verArreglo1 = "Arreglo1: "
    var verArreglo2 = "Arreglo2: "
    var verArregloSuma = "Arreglo sumado: "
    for (i in 0..arreglo1.size -1){

        arreglo1[i] = Random.nextInt(0,10)
        arreglo2[i] = Random.nextInt(0,10)
        arreglosuma[i] = arreglo1[i] + arreglo2[i]

        verArreglo1 += if (i == arreglo1.lastIndex)
            arreglo1[i] else arreglo1[i].toString() + " ,"

        verArreglo2 += if (i == arreglo2.lastIndex)
            arreglo2[i] else arreglo2[i].toString() + " ,"

        verArregloSuma += if (i == arreglosuma.lastIndex)
            arreglosuma[i] else arreglosuma[i].toString() + " ,"
    }
    println(verArreglo1)
    println(verArreglo2)
    println(verArregloSuma)
*/





}