package com.example.viewpager251.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation41.utils.Preferences
import com.example.viewpager251.R
import com.example.viewpager251.databinding.FragmentWelcomeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class WelcomeFragment : Fragment() {

@Inject lateinit var preferences: Preferences
    lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWelcomeBinding.inflate(LayoutInflater.from(context), container, false)
        
        text()
        return binding.root
    }

    private fun text() {
        preferences
    }


}