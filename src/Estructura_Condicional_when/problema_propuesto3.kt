package Estructura_Condicional_when
fun main () {
    var equi = 0
    var iso = 0
    var esca = 0
    print("Ingrese la cantidad de triangulos que va a utilizar: ")
    val n = readln().toInt()
    for(i in 1..n){
        print("Ingrese la medida del primer lado del triangulo: ")
        val lad1 = readln().toInt()
        print("Ingrese la medida del segundo lado del triangulo: ")
        val lad2 = readln().toInt()
        print("Ingrese la cantidad del tercer lado del tringulo: ")
        val lad3 = readln().toInt()
        when {
            lad1 == lad2 && lad1 == lad3 -> {
                println("El triangulo es equilatero")
                equi++
            }
            lad1 == lad2 || lad2 == lad3 || lad1 == lad3 -> {
                println("El triangulo es isosceles")
                iso++
            }
            else -> {
                println("El triangulo es escaleno")
                esca++
            }
        }
        println("$equi son triangulos equilateros")
        println("$iso son triangulos isosceles")
        println("$esca son triangulos escalenos ")




    }




































}
