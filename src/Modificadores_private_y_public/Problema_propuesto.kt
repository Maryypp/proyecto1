package Modificadores_private_y_public

import Funciones_tipo_arreglo.cargar

class Arreg {
    private var arreglo = IntArray(5)

    init {
        cargar()
    }
private fun cargar() {
    for (i in arreglo.indices)
        arreglo[i] = ((Math.random()*11)).toInt()

    }
    fun imprimir () {
        println("Lista del arreglo")
        for (i in arreglo.indices)
            println("${arreglo[i]}")
    }
    fun mayor(){
            var mayor = arreglo[0]
            for(i in arreglo.indices)
                if (arreglo[i] > mayor)
                    mayor = arreglo[i]
            println("El mayor del arreglo es $mayor")
        }

        fun menor() {
            var menor = arreglo[0]
            for(i in arreglo.indices)
                if (arreglo[i] < menor)
                    menor = arreglo[i]
            println("El menor del arreglo es $menor")
        }
    }

    fun main() {
        val arreglo = Arreg()
        arreglo.imprimir()
        arreglo.mayor()
        arreglo.menor()
    }


