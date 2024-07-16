package concepto_funciones

fun cuadrado() {
    print("Ingrese un numero entero:")
    val num = readln().toInt()
    val cua = (num*num)
    println("$num al cuadrado es: $cua")
    println("**********************************************")
}
fun producto() {
    println("Ingrese el primer valor:")
    val nu = readln().toInt()
    print("Ingrese un segundo valor:")
    val numos = readln().toInt()
    val resu = (nu*numos)
    print("El producto de estos numeros es: $resu")
}
fun main() {
    cuadrado()
    producto()

}