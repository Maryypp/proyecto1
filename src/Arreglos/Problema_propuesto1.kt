package Arreglos
fun main() {
    val valoress = FloatArray(8)
    var total = 0f
    for (i in 0..valoress.size -1) {
        print("Ingrese el valor: ")
        valoress[i] = readln().toFloat()
        total += valoress[i]
    }
    var may = 0f
    var mayo = 0
    for (i in 0..valoress.size -1) {
        if (valoress[i] > 36)
            may += valoress[i]
        else
            if (valoress[i] > 50)
                mayo++
    }
    println("El valor acumulado de todos los valores es: $total")
    println("El valor acumulado de los valores que son mayores a 36: $may")
    println("La cantidad de valores mayores a 50 es: $mayo")

}
