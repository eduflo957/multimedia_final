package com.example.multimedia_final

import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.multimedia_final.databinding.ActivityElegirPersonajeBinding

class elegirPersonaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityElegirPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personajesDBHelper: mySQLiteHelper
        personajesDBHelper = mySQLiteHelper(this)

        //AQUI VA LA PROGRAMACIÓN PARA BUSCAR EN LA BASE DE DATOS

        //campos tabla: id, nombre, clase, fuerza, lugar, vida, edad, raza
        binding.botonBuscar.setOnClickListener {
            print("PUTO BOTON PULSADO")
            binding.textInfoConsultada.text = ""
            val db: SQLiteDatabase = personajesDBHelper.readableDatabase
            val buscarNombre = binding.editNombreBuscado.text.toString()
            val cursor = db.rawQuery(
                "SELECT id, nombre, clase, fuerza, lugar, vida, edad, raza FROM personajes WHERE nombre='$buscarNombre'",
                null,
            )

            if (cursor.moveToFirst()) {
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
                    "Raza: " + cursor.getString(3).toString() + "\n"
                )
                binding.textInfoConsultada.append(
                    "Edad: " + cursor.getString(4).toString() + "\n"
                )
                binding.textInfoConsultada.append(
                    "Fuerza: " + cursor.getString(5).toString() + "\n"
                )
                binding.textInfoConsultada.append(
                    "Lugar: " + cursor.getString(5).toString() + "\n"
                )
                binding.textInfoConsultada.append(
                    "Vida: " + cursor.getString(5).toString() + "\n\n"
                )
            } else {
                Toast.makeText(
                    this, "No existe ese usuario",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        binding.editNombreBuscado.setText("")
        binding.botonJugarElegir.setOnClickListener {
            val intentJugar = Intent(this, PantallaJugarAleatorio::class.java)
            startActivity(intentJugar)
        }
        binding.botonInicioElegir.setOnClickListener {
            val intentInicio = Intent(this, MainActivity::class.java)
            startActivity(intentInicio)
        }
    }
}