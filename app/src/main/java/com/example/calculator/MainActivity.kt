package com.example.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        var resultado = 0;
        var suma = false;
        var resta = false;
        var mult = false;
        var div = false;

        binding.puntoButton.setOnClickListener{
            if (!binding.salida.text.contains("."))
                binding.salida.text="${binding.salida.text}"
        }

        binding.masMenos.setOnClickListener{
            binding.salida.text = String.format((binding.salida.text.toString().toDouble() * -1).toString())
        }

        binding.porcent.setOnClickListener {

        }
    }
}