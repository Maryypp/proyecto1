package Constructores

class Puntos (var x: Int, var y: Int){

    fun cuadrante(): String {
          return when {
              x > 0 && y > 0 -> "Este punto esta en el primer cuadrante"
              x < 0 && y > 0 -> "Este punto esta en el segundo cuadrante"
              x < 0 && y < 0 -> "Este punto esta en el tercer cuadrante"
              x > 0 && y < 0 -> "Este punto se encuentra en el cuarto cuadrante"
              x == 0 -> "esta en el eje x"
              y == 0  -> "esta en el eje y"
              else -> "No se encuentra en ningun cuadrante"
          }
    }
}
fun main(){
    val cuadrante1 = Puntos(2,3)
    val cuadrante2 = Puntos(-3,4)
    val cuadrante3 = Puntos(-4,-1)
    val cuadrante4 = Puntos(6,-6)

    println("Primer punto: ${cuadrante1.cuadrante()}")
    println("Segundo punto: ${cuadrante2.cuadrante()}")
    println("Tercer punto: ${cuadrante3.cuadrante()}")
    println("Cuarto punto: ${cuadrante4.cuadrante()}")


}