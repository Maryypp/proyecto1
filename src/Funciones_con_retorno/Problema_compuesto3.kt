package Funciones_con_retorno

fun superfi(lad1: Int, lad2: Int): Int {
    val superfi = lad1*lad2
    return superfi

}
fun main() {
    print("Ingrese el primer lado del rectangulo 1:")
    val lado1 = readln().toInt()
    print("Ingrese el segundo lado del rectangulo 1:")
    val lado2 = readln().toInt()
    print("Ingrese el primer lado del rectangulo 2:")
    val lado3 = readln().toInt()
    print("Ingrese el segundo lado del rectangulo 2:")
    val lado4 = readln().toInt()
    if (superfi(lado1,lado2)> superfi(lado3,lado4))
        print("El primer rectangulo tiene una superficie mayor")
        else
                if (superfi(lado1, lado2)< superfi(lado3, lado4))
                    print("El segundo rectangulo tiene una superficie mayor")
    else
        if (superfi(lado1, lado2) == superfi(lado3, lado4))
        print("Los rectangulos tienen la misma superficie")


}