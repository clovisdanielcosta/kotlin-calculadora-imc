package com.dio.imcapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        alturaEDT?.doAfterTextChanged { text ->
            // Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        pesoEDT?.doOnTextChanged { text, _, _, _ ->
            // titleTXT?.text = text
        }

        calcularBTN?.setOnClickListener {
            calcularIMC(pesoEDT.text.toString(), alturaEDT?.text.toString())
        }
    }

    @SuppressLint("SetTextI18n")
    private fun calcularIMC(peso: String, altura: String) {
        val pesoX = peso.toFloatOrNull()
        val alturaY = altura.toFloatOrNull()

        if (pesoX != null && alturaY != null) {
            val imc = pesoX / (alturaY * alturaY)
            titleTXT.text = "Seu IMC é: %.2f".format(imc)
        }
    }


}