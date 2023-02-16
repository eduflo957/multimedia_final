package com.example.multimedia_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        /*var fuerza = binding.editFuerza.text as String
        var lugar = binding.editLugar.text as String
        var vida = binding.editVida.text as String
*/
        binding.botonGuardar.setOnClickListener {
            Toast.makeText(this, "Usuario: poner usuario creado correctamente", Toast.LENGTH_LONG)
                .show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
/*

        var edad = "-"
        val spinnerEdad=findViewById<Spinner>(R.id.spinnerEdad)
        val listaEdad = arrayOf("18", "19", "20", "21", "22", "23", "24", "25")
        val adaptadorEdad = ArrayAdapter(this, android.R.layout.simple_spinner_item, listaEdad)
        binding.spinnerEdad.adapter = adaptadorEdad
        binding.spinnerEdad.setOnClickListener {
            when (spinnerEdad.selectedItem.toString()) {
                "18" -> edad = "18"
                "19" -> edad = "19"
                "20" -> edad = "20"
                "21" -> edad = "21"
                "22" -> edad = "22"
                "23" -> edad = "23"
                "24" -> edad = "24"
                "25" -> edad = "25"
            }

*/


        /*var raza = "-"
        val spinnerRaza=findViewById<Spinner>(R.id.spinnerEdad)
        val listaRaza = arrayOf("Goblin", "Enano", "Humano", "Elfo")
        val adaptadorRaza = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, listaRaza)
        spinnerRaza.adapter = adaptadorRaza
        binding.spinnerEdad.setOnClickListener {
            when (spinnerRaza.selectedItem.toString()) {
                "Goblin" -> raza = "Goblin"
                "Enano" -> raza = "Enano"
                "Humano" -> raza = "Humano"
                "Elfo" -> raza = "Elfo"
            }

            }*/





    }
}