package com.example.imc

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcularIMC(view: View) {
        val textREsultado = findViewById<TextView>(R.id.textResultado)
        val edidtPeso = findViewById<EditText>(R.id.editPeso)
        val edidtAltura = findViewById<EditText>(R.id.editAltura)

        val peso = edidtPeso.getText().toString()
        val altura = edidtAltura.getText().toString()

        val pesoConvertido: Double = peso.toDouble()
        val alturaConvertido: Double = altura.toDouble()

        val resultadoIMC = pesoConvertido / (alturaConvertido * alturaConvertido)

        textREsultado.setText("O SEU IMC GORDAO É $resultadoIMC")



    }


}