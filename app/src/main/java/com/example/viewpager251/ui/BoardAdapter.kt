package com.example.viewpager251.ui

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.viewpager251.R

class BoardAdapter(fm: FragmentManager,) : FragmentStatePagerAdapter(fm) {

    private val listBoarding = arrayOf(
        BoardModel(
            R.drawable.img1,
            "To-do list!",
            "Here you can write down something important or make a schedule for tomorrow:)", false
        ),
        BoardModel(
            R.drawable.img2,
            "Share your crazy idea ^_^",
            "You can easily share with your report, list or schedule and it's convenient", false
        ),
        BoardModel(
            R.drawable.img3,
            "Flexibility",
            "Your note with you at home, at work, even at the resort", true
        ) , BoardModel(
            R.drawable.img3,
            "Flexibility",
            "Your note with you at home, at work, even at the resort", true
        )
    )

    override fun getCount(): Int = listBoarding.size

    override fun getItem(position: Int): Fragment {
        val data = bundleOf("onboard" to listBoarding[position])
        val fragment = OnboardPageFragment()
        fragment.arguments = data
        return fragment
    }


}