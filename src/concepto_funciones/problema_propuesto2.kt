package concepto_funciones
fun menor() {
    print("Ingrese el primer valor:")
    val valo = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor = readln().toInt()
    print("Ingrese un tercer valor:")
    val valorr = readln().toInt()
    when {
        valo < valor && valo < valorr -> print("El numero menor es: $valo")
        valor < valo && valor < valorr -> print("El numero menor es: $valor")
        else -> println("El numero menor es: $valorr")
    }
}
fun main() {
    menor()
    menor()

}