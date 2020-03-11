package mx.edu.ittepic.ladm_u2_practica2_juegoburbujas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var lienzo :Lienzo ?= null
    var radio = 0f
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        lienzo = Lienzo(this)
        setContentView(lienzo!!)

        Hilo(this).start()
    }
}