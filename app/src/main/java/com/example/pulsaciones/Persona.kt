package com.example.pulsaciones

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.channels.UnresolvedAddressException

class Persona (){
    var Identificacion:String=""
    var Nombre:String=""
    var Edad:Int=0
    var Sexo:String=""
    var Pulsaciones:Int=0


    fun Calcular(){

        if(Sexo.equals("Femenino")){
            Pulsaciones=((210-Edad)/10)
        }else if(Sexo.equals("Masculino")){
            Pulsaciones=((220-Edad)/10)
        }

    }

    
}
