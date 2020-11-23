package com.lastreact.myapplication.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lastreact.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.textViewDemo.text = "Hello Text view Demo!"
        setContentView(binding.root)
    }
}