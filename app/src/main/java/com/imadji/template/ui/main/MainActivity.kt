package com.imadji.template.ui.main

import android.os.Bundle
import com.imadji.template.R
import com.imadji.template.navigation.ScreenType
import com.imadji.template.ui.base.BaseActivity
import com.imadji.template.ui.main.fragments.HomeFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        when (intent.getSerializableExtra("screen_type")) {
            ScreenType.HOME -> addFragment(HomeFragment(), R.id.fragmentContainer, addToBackStack = true)
            else -> finish()
        }
    }
}
