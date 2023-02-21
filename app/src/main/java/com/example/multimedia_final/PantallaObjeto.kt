package com.example.multimedia_final

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multimedia_final.databinding.ActivityPantallaObjetoBinding
/*import com.example.multimedia_t10.Objeto
import com.example.multimedia_t10.comprobarPeso
import com.example.multimedia_t10.mochila1*/

class PantallaObjeto : AppCompatActivity() {
 /*   @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla_objeto)

        val binding = ActivityPantallaObjetoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.setImageResource(R.drawable.img_objeto)

        var objetoParaAñadirMochila1 = Objeto("nuevoObjeto", 300, 50, 100)

        binding.textView2.text = mochila1.listaObjetos.toString() + "\n" +
                "Peso actual mochila: ${mochila1.peso} \n" +
                "PESO MÁXIMO: ${mochila1.pesoMax}"

        binding.button.setOnClickListener {
            comprobarPeso(mochila1, objetoParaAñadirMochila1, this)
            val intent = Intent(this, PantallaVacia::class.java)
            intent.putExtra("textoSiguientePantalla",
                mochila1.listaObjetos.toString() + "\n" +
                        "Peso actual mochila: ${mochila1.peso} \n" +
                        "PESO MÁXIMO: ${mochila1.pesoMax}")
            startActivity(intent)
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    */
}