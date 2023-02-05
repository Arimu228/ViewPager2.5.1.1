package com.example.viewpager251.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.viewpager251.databinding.FragmentOnboardPageBinding


class OnboardPageFragment() : Fragment() {
    private lateinit var binding: FragmentOnboardPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnboardPageBinding.inflate(LayoutInflater.from(context), container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        initListener()
    }


    private fun initViews() {
        arguments?.let {
            val data = it.getSerializable("onboard") as BoardModel
            binding.tvTitleBoard.text = data.title
            binding.tvDescriptionBoard.text = data.description
            data.img?.let { it1 -> binding.imgBoard.setImageResource(it1) }
            binding.btnStartBoard.isVisible = data.isLast == true
        }
    }

    private fun initListener() {

        binding.btnStartBoard.setOnClickListener {

        }
    }
}