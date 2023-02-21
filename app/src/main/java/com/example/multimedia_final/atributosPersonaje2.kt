package com.example.multimedia_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Toast
import com.example.multimedia_final.databinding.ActivityAtributosPersonaje2Binding

class atributosPersonaje2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atributos_personaje2)

        val binding = ActivityAtributosPersonaje2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val personajesDBHelper: mySQLiteHelper
        personajesDBHelper = mySQLiteHelper(this)

        var fuerza = binding.editFuerza.text.toString()
        var lugar = binding.editLugar.text.toString()
        var vida = binding.editVida.text.toString()
        var nombre = intent.getStringExtra("guardarNombre")
        var clase = intent.getStringExtra("guardarClase")
        println(nombre + "pantalaaaaaaaaaaaaaaa")

        var edad = "-"
        val listaEdad = arrayOf("18", "19", "20", "21", "22", "23", "24", "25")
        val adaptadorEdad = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaEdad)
        binding.spinnerEdad.adapter = adaptadorEdad
        binding.spinnerEdad.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    positionEdad: Int,
                    id: Long
                ) {
                    if (positionEdad != 0) {
                        edad = listaEdad[positionEdad]
                        println("Edad: $edad")
                    } else {
                        edad = listaEdad[positionEdad]
                        println("Edad: $edad")
                    }
                }
            }

        var raza = "-"
        val listaRaza = arrayOf("Goblin", "Enano", "Humano", "Elfo")
        val adaptadorRaza = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaRaza)
        binding.spinnerRaza.adapter = adaptadorRaza
        binding.spinnerRaza.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                positionRaza: Int,
                id: Long
            ) {
                if (positionRaza != 0) {
                    raza = listaRaza[positionRaza]
                    println("Raza: $raza")
                } else {
                    raza = listaRaza[positionRaza]
                    println("Raza: $raza")
                }
            }
        }

        binding.botonGuardar.setOnClickListener()
        {
            fuerza = binding.editFuerza.text.toString()
            lugar = binding.editLugar.text.toString()
            vida = binding.editVida.text.toString()

            if (nombre != null) {
                if (clase != null) {
                    personajesDBHelper.anyadirDato(
                        nombre, clase, raza, edad, fuerza, lugar, vida
                    )
                }
            }
            Toast.makeText(
                this, "Datos guardados correctamente",
                Toast.LENGTH_LONG
            ).show()
        }

        binding.botonInicio.setOnClickListener()
        {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.botonJugar.setOnClickListener()
        {
            val intent = Intent(this, elegirPersonaje::class.java)
            startActivity(intent)
        }


    }
}