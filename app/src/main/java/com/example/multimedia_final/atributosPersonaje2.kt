package com.example.multimedia_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.multimedia_final.databinding.ActivityAtributosPersonaje2Binding

class atributosPersonaje2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_atributos_personaje2)

        val binding = ActivityAtributosPersonaje2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var fuerza = binding.editFuerza.text
        var lugar = binding.editLugar.text
        var vida = binding.editVida.text

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
                    position: Int,
                    id: Long
                ) {
                    edad = listaEdad[position-1]
                    println("Edad: $edad")
                }

            }


        var raza = "-"
        val listaRaza = arrayOf("Goblin", "Enano", "Humano", "Elfo")
        val adaptadorRaza = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaRaza)
        binding.spinnerRaza.adapter = adaptadorRaza
        binding.spinnerEdad.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                raza = listaRaza[position]
                println("Raza: $raza")
            }

        }

        binding.botonGuardar.setOnClickListener {
            Toast.makeText(this, "Usuario: poner usuario creado correctamente", Toast.LENGTH_LONG)
                .show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}