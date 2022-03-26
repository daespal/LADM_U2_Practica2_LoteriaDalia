package com.example.ladm_u2_practica2_loteriadalia

import android.view.View
import android.widget.ImageView
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineCarta (ce:MainActivity) : View(ce){

    val corutina = GlobalScope.launch {
        while (true){
            ce.runOnUiThread{
                invalidate()
            }
            delay(20L)
        }
    }






}