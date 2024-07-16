package Estructura_condicional_when_argumento
fun main() {
    print("Ingrese un valor entero positivo comprendido entre 1 y 99999: ")
    val valor = readln().toInt()
    when(valor){
        in 1..9 -> print("Tiene un digito")
        in 10..99 -> print("Tiene dos digitos")
        in 100..999 -> print("Tiene tres digitos")
        in 1000..9999 -> print("Tiene cuatro digitos")
        in 10000..999999 -> print("Tiene cinco digitos")
        else -> print("No se encuentra comprendido en el rango indicado")
    }

}
