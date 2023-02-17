package com.example.multimedia_final

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_final.databinding.ActivityElegirPersonajeBinding

class elegirPersonaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityElegirPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personajesDBHelper: mySQLiteHelper
        personajesDBHelper = mySQLiteHelper(this)

        //AQUI VA LA PROGRAMACIÓN PARA BUSCAR EN LA BASE DE DATOS

        binding.botonBuscar.setOnClickListener {
            binding.textInfoConsultada.text = ""
            binding.editNombreBuscado.setText("")
            val db: SQLiteDatabase = personajesDBHelper.readableDatabase
            val cursor = db.rawQuery(
                "SELECT * FROM personajes",
                null,
            )
            if (cursor.moveToFirst()) {
                do {
                    if (cursor.getString(1).toString() ==
                        binding.editNombreBuscado.text.toString()
                    ) {
                        binding.textInfoConsultada.append(
                            "Caracterísitcas y atributos: \n" +
                                    "ID Personaje: " + cursor.getInt(0).toString() + "\n"
                        )
                        binding.textInfoConsultada.append(
                            "Nombre: " + cursor.getString(1).toString() + "\n"
                        )
                        binding.textInfoConsultada.append(
                            "Clase: " + cursor.getString(2).toString() + "\n"
                        )
                        binding.textInfoConsultada.append(
                            "Fuerza: " + cursor.getString(3).toString() + "\n"
                        )
                        binding.textInfoConsultada.append(
                            "Lugar: " + cursor.getString(4).toString() + "\n"
                        )
                        binding.textInfoConsultada.append(
                            "Vida: " + cursor.getString(5).toString() + "\n"
                        )
                        binding.textInfoConsultada.append(
                            "Edad: " + cursor.getString(5).toString() + "\n"
                        )
                        binding.textInfoConsultada.append(
                            "Raza: " + cursor.getString(5).toString()+ "\n\n"
                        )
                    }
                }
                    /*//el numero es el índice de la columna, el 0 es el ID, segundo nombre
                    //el tercero es el mail.
                    binding.textInfoConsultada.append(
                        cursor.getInt(0).toString() + ": ")
                    binding.textInfoConsultada.append(
                        cursor.getString(1).toString() + ", ")
                    binding.textInfoConsultada.append(
                        cursor.getString(2).toString() + "\n")*/
                 while (cursor.moveToNext())
            }
        }
    }


}