package com.mgh.pmdm.contador

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mgh.pmdm.contador.R.id.botonMenos
import com.mgh.pmdm.contador.R.id.layout
import com.mgh.pmdm.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var contador=0
    //Esto es un comentario

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val miDialogo = MiDialogFragment()

        // Referencia al TextView
        //val textViewContador=findViewById<TextView>(R.id.textViewContador)

        // Inicializamos el TextView con el contador a 0
        //textViewContador.setText(contador.toString())

        // Referencia al botón
       // val btAdd=findViewById<Button>(R.id.btAdd)
        //val botonMenos=findViewById<Button>(botonMenos)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
       binding.btAdd.setOnClickListener {
            contador++
            binding.textViewContador.setText(contador.toString())
        }

        binding.botonMenos.setOnClickListener{
            contador--
            binding.textViewContador.setText(contador.toString())
        }

        binding.botonReset.setOnClickListener{
            contador = 0
            binding.textViewContador.setText(contador.toString())

            miDialogo.show(supportFragmentManager, "MiDialogo")
        }

    }
}