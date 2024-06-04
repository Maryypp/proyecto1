fun main() {
    /*
    //Problema 1
    var x = 1
    while (x <= 100){
        println(x)
        x++
    }
*/


/*
//Problema 2
    print("Ingrese un valor: ")
    val valor = readln().toInt()
    var x = 1
    while (x <= valor){
        println(x)
        x++
    }
*/

    /*
// Problema 3
    var x = 1
    var suma = 0

    while (x <= 10){
        print("Ingrese el valor $x: ")
        val valor =readln().toInt()
        suma = suma + valor
        x++

    }
    println("La suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("El promedio es $promedio")
*/

//problema 4
    print("Cuantas piezas procesara: ")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n) {
        print("Ingrese la medida de la pieza: ")
        var largo = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30) {
            cantidad = cantidad + 1
        }
        x++
    }
    print("La cantidad de piezas aptas son: $cantidad")



}