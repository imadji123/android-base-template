package com.imadji.template.common

import android.view.View
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.commit
import com.google.android.material.snackbar.Snackbar

fun FragmentActivity.showFragment(fragment: Fragment, @IdRes container: Int, addToBackStack: Boolean = false) {
    supportFragmentManager.commit(allowStateLoss = true) {
        if (addToBackStack) addToBackStack(fragment.tag)
        replace(container, fragment)
    }
}

fun FragmentActivity.goBack() {
    supportFragmentManager.popBackStack()
}

inline fun View.onClick(crossinline onClick: () -> Unit) {
    setOnClickListener { onClick() }
}

fun showSnackbar(message: String, rootView: View) = Snackbar.make(rootView, message, Snackbar.LENGTH_SHORT).show()