package com.example.pulsaciones


import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val persona = Persona()

    fun CapturarSexo() {
        when {
            radioButtonM.isChecked -> {
                persona.Sexo = "Masculino"
            }
            radioButtonF.isChecked -> {
                persona.Sexo = "Femenino"
            }
        }
    }

    fun ValidarCampos(): Boolean {
        try {
            persona.Edad = txtEdad.text.toString().toInt()
            return true
        } catch (e: Exception) {

            Toast.makeText(
                applicationContext, "Edad no valida"
                , Toast.LENGTH_SHORT
            ).show()
            return false
        }
    }


    fun CapturarDatos() {
        persona.Identificacion = txtIdentificacion.text.toString()
        persona.Nombre = txtNombre.text.toString()
        ValidarCampos()
        CapturarSexo()
        persona.Calcular();
        TvPulsaciones.setText( persona.Pulsaciones.toString())

    }

    fun CalcularPulsaciones(view: View) {
        if(ValidarCampos()){
            CapturarDatos()
            Toast.makeText(
                applicationContext, "Sus pulsaciones fueron calculadas "
                , Toast.LENGTH_SHORT
            ).show()
        }

    }
}