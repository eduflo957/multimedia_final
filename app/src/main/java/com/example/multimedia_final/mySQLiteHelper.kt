package com.example.multimedia_final

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.text.Editable


class mySQLiteHelper(context: Context) : SQLiteOpenHelper(
    context, "personajes.db", null, 1
) {
    override fun onCreate(db: SQLiteDatabase?) {
        val ordenCreacion = "CREATE TABLE personajes" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre TEXT, clase TEXT, fuerza TEXT, lugar TEXT," +
                "vida TEXT, edad TEXT, raza TEXT)"
        //Con las exclamaciones le decimos que nunca va a estar vacía
        db!!.execSQL(ordenCreacion)
        //Podemos añadir try/catch, pero solo en version de pruebas
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val ordenBorrado = "DROP TABLE IF EXISTS personajes"
        db!!.execSQL(ordenBorrado)
        onCreate(db)
    }

    fun anyadirDato(
        nombre: String, clase:String, fuerza:String, lugar:String,
        vida:String, edad:String, raza:String) {
        val datos = ContentValues()
        datos.put("nombre", nombre)
        datos.put("clase", clase)
        datos.put("raza", raza)
        datos.put("edad", edad)
        datos.put("fuerza", fuerza)
        datos.put("lugar", lugar)
        datos.put("vida", vida)



        val db = this.writableDatabase
        db.insert("personajes", null, datos)
        db.close()
    }


}