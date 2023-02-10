package com.example.viewpager251.di

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject


@Module
@InstallIn(SingletonComponent::class)
class AppModule  {

@Provides
fun providePref (@ApplicationContext context: Context): SharedPreferences {
    return context.getSharedPreferences("preferences", MODE_PRIVATE)
}

}