package Colaboracion_de_clases

class Socio(var Nombre: String, var antiguedad: Int){
    fun imprimirm(){
        println("El socio $Nombre tiene una antiguedad de $antiguedad años")
    }
}
class Club {
    val socio1: Socio = Socio("Juanchito", 6)
    val socio2: Socio= Socio("Juanito",5)
    val socio3: Socio= Socio("Pepito", 9)

    fun imprimir(){
        socio1.imprimirm()
        socio2.imprimirm()
        socio3.imprimirm()
        print("El socio con mayor antiguedad es: ")
        when {
            socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad -> println(socio1.Nombre)
            socio2.antiguedad > socio1.antiguedad && socio2.antiguedad > socio3.antiguedad -> println(socio2.Nombre)
            else -> println(socio3.Nombre)
        }

    }
}
fun main (){
    val socios1 = Club()
    socios1.imprimir()

}