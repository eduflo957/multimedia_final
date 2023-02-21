package com.example.multimedia_final

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.multimedia_final.databinding.ActivityPantallaMercaderBinding


class PantallaMercader : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_mercader)

        val binding = ActivityPantallaMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setImageResource(R.drawable.img_mercader)

        binding.button.setOnClickListener {
            binding.linear1.visibility = View.GONE
            binding.botonComprar.setOnClickListener {
                binding.imageView.setImageResource(R.drawable.img_cosa_hoz)
                binding.textView3.text = ""

                //Revisar porque el boton mas y el menos tiene que ir en un linear
                //para que aparezca sólo cuando se seleccione, mientras tanto el linea tiene que estar apagado.
                val cambColBotMas = findViewById<Button>(R.id.botonMas)
                val cambColBotMenos = findViewById<Button>(R.id.botonMenos)
                findViewById<EditText>(R.id.textView3).setOnFocusChangeListener { view: View, bool: Boolean ->
                    if (bool.equals(false)) {
                        cambColBotMas.setBackgroundColor(0xFF000000.toInt())
                        cambColBotMenos.setBackgroundColor(0xFF000000.toInt())
                    } else {
                        cambColBotMas.setBackgroundColor(0xFF000000.toInt())
                        cambColBotMenos.setBackgroundColor(0xFF000000.toInt())
                    }
                }

                findViewById<Button>(R.id.botonMas).setOnClickListener {
                    metodoSumar(it)
                }
                findViewById<Button>(R.id.botonMenos).setOnClickListener {
                    metodoRestar(it)
                }



            }

            binding.botonVender.setOnClickListener {

            }

            binding.botonCancelar.setOnClickListener {
                val intent = Intent(this, PantallaMercader::class.java)
                startActivity(intent)
            }
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }





    @SuppressLint("SetTextI18n")
    private fun metodoSumar(view: View) {
        val numUsuario = 150
        var numPantalla = findViewById<TextView>(R.id.textView3)

        val nro1 = numUsuario
        val nro2 = numPantalla.text.toString().toInt()
        val suma = nro1 + nro2
        numPantalla.text = "$suma"
    }

    private fun metodoRestar(view: View) {
        val numUsuario = 150
        val numPantalla = findViewById<TextView>(R.id.textView3)

        val nro1 = numUsuario
        val nro2 = numPantalla.text.toString().toInt()
        val resta = nro2 - nro1
        if (resta < 0) {
            numPantalla.text = "0"
        } else {
            numPantalla.text = "$resta"
        }
    }
}

