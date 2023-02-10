package com.example.viewpager251.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager251.utils.Preferences
import com.example.viewpager251.R
import com.example.viewpager251.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
   lateinit var preferences: Preferences

    lateinit var binding: ActivityMainBinding
    override fun  onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        if  (!preferences.isBoardingShowed()){
            supportFragmentManager.beginTransaction().add(R.id.container, OnBoardFragment()).commit()
        }else{
            supportFragmentManager.beginTransaction().add(R.id.container, WelcomeFragment()).commit()
        }
        setContentView(binding.root)
    }




}