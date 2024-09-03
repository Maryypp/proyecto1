package Metodos_set_y_get

class Empleado(var nombre: String, sueldo: Int) {

    var sueldo:Int = 0
        set(valor){
            if(valor >=0)
                field = valor
            else
                field = 0

        }
    init {
        this.sueldo=sueldo

    }
    fun imprimir(){
        println("Nombre del empleado: $nombre")
        println("Sueldo del emoleado: $sueldo")
    }
}
fun main() {
    val empleado1 = Empleado( "Pepo", 2455)
    empleado1.imprimir()
}