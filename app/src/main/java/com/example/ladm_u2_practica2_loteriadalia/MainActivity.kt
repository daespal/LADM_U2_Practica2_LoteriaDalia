package com.example.ladm_u2_practica2_loteriadalia

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ladm_u2_practica2_loteriadalia.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.IOException

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    val inicial = arrayListOf(R.drawable.cartaini1)
    val hilo = Hilo(binding.imagen)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iniciar.setOnClickListener{
            binding.imagen.setImageResource(inicial[0])
            val mp = MediaPlayer.create(this, R.raw.inicio1)
            mp.start()
            hilo.start()
        }
    }

}