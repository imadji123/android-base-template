package com.imadji.template.ui.base

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.imadji.template.common.goBack
import com.imadji.template.common.showFragment
import com.imadji.template.navigation.NavigationFactory
import com.imadji.template.navigation.Navigator

abstract class BaseActivity : AppCompatActivity() {

    protected val appNavigator: Navigator by lazy { NavigationFactory.provideNavigator(this) }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount <= 1) finish() else goBack()
    }

    fun addFragment(fragment: Fragment, containerId: Int, addToBackStack: Boolean = false) {
        showFragment(fragment, containerId, addToBackStack)
    }

}
