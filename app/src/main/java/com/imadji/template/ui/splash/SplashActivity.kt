package com.imadji.template.ui.splash

import android.content.Intent
import android.os.Bundle
import com.imadji.template.navigation.ScreenType
import com.imadji.template.ui.base.BaseActivity
import com.imadji.template.ui.main.MainActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("screen_type", ScreenType.HOME)
        }
        startActivity(intent)
        finish()
    }
}
