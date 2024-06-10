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

    /*
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

*/


    //problemas propuestos

    //1
    /*
    var x = 1
    var notalt = 0
    var notbaj = 0
    while (x <= 10) {
        print("Ingrese la nota del alumno: ")
        val nota = readln().toInt()
        x++
        if (nota >= 70 && nota < 100)
            notalt = notalt + 1
        else
            notbaj = notbaj + 1
    }
    println("La cantidad de notas que son mayores a 7 son: $notalt")
    print("La cantidad de notas que son menores a 7 son: $notbaj")
*/


    //2
    /*
    var x = 1
    print("Ingrese la cantidad de alturas que va a ingresar: ")
    val n = readln().toInt()
    var altu = 0.0
    while(x <= n) {
        print("Ingrese la altura: ")
        val altura = readln().toDouble()
        altu = altu + altura
        x++
    }
    val promedio = altu/n
    print("El promedio de la altura de las personas es: $promedio")
*/
    //3
    /*
    var x = 1
    print("Ingrese la cantidad de empleados: ")
    val n = readln().toInt()
    var sum = 0
    var sueldito = 0
    var sueldote = 0
    while(x <= n){
        print("Ingrese el sueldo del empleado: ")
        val sueldo = readln().toInt()
        sum = sum + sueldo
        x++
        if(sueldo >= 100 && sueldo <= 300)
            sueldito++
        else
            if(sueldo >=300 && sueldo <= 500)
                sueldote++
    }
    println("La cantidad de empleados que cobran entre $100 y $300 son: $sueldito")
    println("La cantidad de empleados que cobran entre $300 y $500 son: $sueldote")
    val importe = sum*n
    println("El importe que gasta la empresa en los sueldos es: $importe")
*/

    //4
 /*
    var x = 8
    while (x <= 500) {
        println("$x")
        x = x + 8
    }
*/



    //5
/*
    var x = 1
    var x2 = 1
    var suma1 = 0
    var suma2 = 0
    println("Lista 1")
    while (x <= 5) {
        print("Ingrese un valor:")
        val vall1: Int = readln().toInt()
        suma1 = suma1 + vall1
        x = x + 1
    }
    println("Lista 2")
    while (x2 <= 5) {
        print("Ingrese un valor:")
        val vall2: Int = readln().toInt()
        suma2 = suma2 + vall2
        x2 = x2 + 1
    }
    if(suma1 == suma2)
        println("Listas iguales")
    else
        if(suma1 > suma2)
            println("Lista 1 mayor")
    else
        if(suma2 > suma1)
            println("Lista 2 mayor")
*/


//6
/*
    var x = 1
    var pares = 0
    var impares = 0
    print("Ingrese la cantidad de numeros que va a ingresar: ")
    val n : Int = readln().toInt()
    while (x <= n) {
        print("Ingrese un numero:")
        val num: Int = readln().toInt()
        x = x + 1
        if (num % 2 == 0)
            pares = pares + 1
        else
            impares = impares + 1
    }
    println("La cantidad de numero pares es: $pares")
    println("La cantidad de numero impares es: $impares")

*/






}