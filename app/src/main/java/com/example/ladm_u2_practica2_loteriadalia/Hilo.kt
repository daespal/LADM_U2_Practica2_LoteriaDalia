package com.example.ladm_u2_practica2_loteriadalia

import android.app.Activity
import android.media.MediaPlayer
import android.widget.ImageView
import com.example.ladm_u2_practica2_loteriadalia.databinding.ActivityMainBinding
import java.io.IOException
import kotlin.random.Random

class Hilo(im: ImageView) : Thread() {
    var ejecutar= true
    var pausar= false
    var imagGlob = im
    var contador=0
    val mazo = arrayOf(R.drawable.carta1,R.drawable.carta2,R.drawable.carta3,R.drawable.carta4,
        R.drawable.carta5,R.drawable.carta6,R.drawable.carta7,R.drawable.carta8,
        R.drawable.carta9,R.drawable.carta10,R.drawable.carta11,R.drawable.carta12,
        R.drawable.carta13,R.drawable.carta14,R.drawable.carta15,R.drawable.carta16,
        R.drawable.carta17,R.drawable.carta18,R.drawable.carta19,R.drawable.carta20,
        R.drawable.carta21,R.drawable.carta22,R.drawable.carta23,R.drawable.carta24,
        R.drawable.carta25,R.drawable.carta26,R.drawable.carta27,R.drawable.carta28,
        R.drawable.carta28,R.drawable.carta29,R.drawable.carta30,R.drawable.carta31,
        R.drawable.carta32,R.drawable.carta33,R.drawable.carta34,R.drawable.carta35,
        R.drawable.carta36,R.drawable.carta37,R.drawable.carta38,R.drawable.carta39,
        R.drawable.carta40,R.drawable.carta41,R.drawable.carta42,R.drawable.carta43,
        R.drawable.carta44,R.drawable.carta45,R.drawable.carta46,R.drawable.carta47,
        R.drawable.carta48,R.drawable.carta49,R.drawable.carta50,R.drawable.carta51,
        R.drawable.carta52,R.drawable.carta53,R.drawable.carta54)

    override fun run() {
        super.run()

        while (ejecutar){

            if (!pausar){
                imagGlob.setImageResource(mazo[contador++])

            }
            mazo.shuffle()
            sleep(3000)
        }
    }

    fun terminarHilo(){
        ejecutar = false
    }

    fun pausarHilo(){
        pausar = true
    }

    fun despausarHilo(){
        pausar = false
    }

    fun estaPausado(): Boolean{
        return pausar
    }



}