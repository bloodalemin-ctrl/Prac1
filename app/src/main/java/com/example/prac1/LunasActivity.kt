package com.example.prac1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LunasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lunas)

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        // Regresar a PlanetasActivity
        btnRegresar.setOnClickListener {
            finish()
        }
    }
}