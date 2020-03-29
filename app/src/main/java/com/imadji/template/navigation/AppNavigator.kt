package com.imadji.template.navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.imadji.template.ui.base.BaseActivity
import com.imadji.template.ui.main.MainActivity

class AppNavigator(private val activity: AppCompatActivity) : Navigator {

    companion object {
        const val SCREEN_TYPE = "screen_type"
    }

    override fun showMainActivity() {
        navigateTo(getIntent<MainActivity>().apply {
            putExtra(SCREEN_TYPE, ScreenType.HOME)
        })
    }

    private fun navigateTo(intent: Intent) = activity.startActivity(intent)

    private inline fun <reified T : BaseActivity> getIntent() = Intent(activity, T::class.java)
}
