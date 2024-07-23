package Funciones_parametros_valor_por_defecto

fun suma(v1: Int= 0, v2: Int= 0, v3: Int= 0, v4: Int= 0, v5: Int= 0): Int{
    return v1 + v2 + v3 +v4 + v5
}


fun main(){
    println(suma(2, 3))
    println(suma(1,2,2))
    println(suma(1,1,1,2,1))




    }


