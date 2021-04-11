package com.dio.imcapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_constraint)
        Log.w("Lifecycle", "CREATE - estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "START - deixei a tela visível para você")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "PAUSE - perdeu o foco, você não pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "STOP - a tela não está mais visível mais ainda existe")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "DESTROY - oh não! a tela foi destruída")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "RESTART - a tela está retornando o fico")
    }

}