package com.example.multimedia_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_final.databinding.ActivityCrearPersonajeBinding

class crearPersonaje : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCrearPersonajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*var enviarImagenClase = R.drawable.multimedia_t7_inicio2
        var guardarClase = "Sin clase"
        var guardarNombre = "Sin nombre"

        guardarNombre = binding.editNombre.text as String*/

        binding.botonBerseker.setOnClickListener {
            binding.imageClase.setImageResource(R.drawable.multimedia_t7_berserker_2)
            /*enviarImagenClase = R.drawable.multimedia_t7_berserker_2
            guardarClase = "Berserker"*/
        }

        binding.botonGuerrero.setOnClickListener {
            binding.imageClase.setImageResource(R.drawable.multimedia_t7_guerrero_2)
            /*enviarImagenClase = R.drawable.multimedia_t7_guerrero_2
            guardarClase = "Guerrero"*/
        }

        binding.botonLadron.setOnClickListener {
            binding.imageClase.setImageResource(R.drawable.multimedia_t7_ladron_2)
            /*enviarImagenClase = R.drawable.multimedia_t7_ladron_2
            guardarClase = "Ladron"*/
        }

        binding.botonMago.setOnClickListener {
            binding.imageClase.setImageResource(R.drawable.multimedia_t7_mago_2)
            /*enviarImagenClase = R.drawable.multimedia_t7_mago_2
            guardarClase = "Mago"*/
        }

        binding.botonSiguiente.setOnClickListener {
            val intentClase = Intent(this, atributosPersonaje2::class.java)
            //En realidad esto lo debería guardar en la base de datos
            // porque no afecta a las siguientes pantallas, creo.
            //intentClase.putExtra("enviarImagenClase", enviarImagenClase)
            //intentClase.putExtra("guardarClase", guardarClase)
            //intentClase.putExtra("guardarNombre", guardarNombre)
            startActivity(intentClase)
        }
    }
}
