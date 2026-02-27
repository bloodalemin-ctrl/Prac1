package com.example.prac1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SistemaSolarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema_solar)
        val btnIrPlanetas = findViewById<Button>(R.id.btnIrPlanetas)
        btnIrPlanetas.setOnClickListener {
            val intent = Intent(this, PlanetasActivity::class.java)
            startActivity(intent)
        }
    }
}