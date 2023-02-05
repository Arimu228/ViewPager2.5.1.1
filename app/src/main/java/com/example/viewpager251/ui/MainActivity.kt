package com.example.viewpager251.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager251.R
import com.example.viewpager251.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        setContentView(binding.root)
    }
}