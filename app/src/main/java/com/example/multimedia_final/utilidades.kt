package com.example.multimedia_t10

import android.content.Context
import android.widget.Toast
/*import com.example.multimedia_final.Articulo*/

/*class Objeto (var nombre:String, var peso:Int, var valor:Int, var vida:Int){
    override fun toString(): String {
        return "Objeto con nombre='$nombre', peso=$peso, valor=$valor y vida=$vida)"
    }
}

*//*class Mochila (var listaObjetos:MutableList<Objeto>, var peso:Int, var pesoMax:Int){
    override fun toString(): String {
        return "Mochila con peso=$peso y pesoMax=$pesoMax \n" +
                "Mochila formada por: \n" +
                "${listaObjetos}"
    }
}*//*

fun comprobarPeso (mochila: Mochila, objeto: Objeto, pantalla : Context) {
    if (objeto.peso+mochila.peso>mochila.pesoMax) {
        Toast.makeText(pantalla, "Peso actual: ${mochila.peso} \n" +
                "Peso objeto: ${objeto.peso} \n" +
                "NO SE PUEDE AÑADIR OBJETO NUEVO", Toast.LENGTH_LONG).show()
    } else {
        mochila.listaObjetos.add(objeto)
        mochila.peso = objeto.peso+mochila.peso
    }
}

var listaObjetosMochila1 = mutableListOf(Objeto("linterna", 40, 50, 100),
    Objeto("martillo", 50, 30, 100),
    Objeto("hoz", 30, 80,40))
var mochila1 = Mochila(listaObjetosMochila1, 100, 3000)*/


class Articulo(var id: String, var peso: Int, var valor: Int) {
    override fun toString(): String {
        return "[ID:$id, Peso:$peso, Valor:$valor]"
    }
}

class Mochila(private var pesoMochila: Int) {
    private var contenido = ArrayList<Articulo>()

    fun getPesoMochila(): Int {
        return pesoMochila
    }

    fun addArticulo(articulo: Articulo) {
        if (articulo.peso <= pesoMochila) {
            contenido.add(articulo)
            this.pesoMochila -= articulo.peso
        } else {
            println("La mochila está llena, debes vender artículos")
        }
        println("Peso restante de la Mochila: " + pesoMochila)
    }

    fun getContenido(): ArrayList<Articulo> {
        return contenido
    }

    fun findObjeto(id: String): Int {
        for ((indice, item) in contenido.withIndex()) {
            if (item.id == id) {
                return indice
            }
        }
        return -1
    }
}