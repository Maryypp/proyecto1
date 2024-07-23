package Funciones_internas

fun multiplos2y5(){
    fun multiplo(numero: Int, valor: Int) = numero % valor == 0
    var multi2 = 0
    var multi5 = 0
    for (i in 1..10){
        print("Ingrese un valor: ")
        val valor= readln().toInt()
        if (multiplo(valor,2))
            multi2++
        if (multiplo(valor,5))
            multi5++
    }
    println("Cantidad de múltiplos de 2: $multi2")
    println("Cantidd de múltiplos de 5 : $multi5")
}
fun main(){
    multiplos2y5()
}