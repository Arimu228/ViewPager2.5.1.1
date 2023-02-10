package com.example.viewpager251.utils

import android.content.SharedPreferences
import javax.inject.Inject

class Preferences @Inject constructor(var sharedPreferences: SharedPreferences) {

    //Board
    fun isBoardingShowed(): Boolean {
        return sharedPreferences.getBoolean("board", false)
    }

    fun setBoardingShowed(isShow: Boolean) {
        sharedPreferences.edit().putBoolean("board", isShow).apply()
    }
}