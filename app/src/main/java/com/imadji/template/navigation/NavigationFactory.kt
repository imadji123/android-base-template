package com.imadji.template.navigation

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity

object NavigationFactory {

    fun provideNavigator(activity: AppCompatActivity): Navigator = AppNavigator(activity)

    fun provideFragmentNavigator(activity: FragmentActivity?): FragmentNavigator = AppFragmentNavigator(activity)

}