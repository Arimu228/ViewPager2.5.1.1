package com.example.viewpager251.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager251.utils.Preferences
import com.example.viewpager251.databinding.FragmentWelcomeBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

class WelcomeFragment : Fragment() {


    lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentWelcomeBinding.inflate(LayoutInflater.from(context), container, false)
        
        return binding.root
    }



}