package com.imadji.template.ui.splash

import android.os.Bundle
import com.imadji.template.ui.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        appNavigator.showMainActivity()
        finish()
    }
}
