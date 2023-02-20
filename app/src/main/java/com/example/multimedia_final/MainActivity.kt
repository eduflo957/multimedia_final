package com.example.multimedia_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_final.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonCrear.setOnClickListener {
            println("se aprieta boton")
            val intentCrearPers = Intent(this, crearPersonaje::class.java)
            //intentCrearPers.putExtra("enviarImagenClase", enviarImagenClase)
            startActivity(intentCrearPers)
        }

        binding.botonElegir.setOnClickListener {
            println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
            val intentElegirPers = Intent(this, elegirPersonaje::class.java)
            //intentElegirPers.putExtra("enviarImagenClase", enviarImagenClase)
            startActivity(intentElegirPers)
        }




    }
}