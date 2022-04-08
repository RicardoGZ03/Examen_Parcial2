package com.example.examen_parcial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSiguiente = findViewById<Button>(R.id.BotonSiguiente)

        btnSiguiente.setOnClickListener {
            val intent : Intent = Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }

}