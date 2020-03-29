package com.imadji.template.navigation

import androidx.fragment.app.FragmentActivity
import com.imadji.template.R
import com.imadji.template.common.showFragment
import com.imadji.template.ui.main.fragments.DetailsFragment

class AppFragmentNavigator(private val activity: FragmentActivity?) : FragmentNavigator {

    override fun showDetails() {
        activity?.showFragment(DetailsFragment(), R.id.fragmentContainer, addToBackStack = true)
    }

}
