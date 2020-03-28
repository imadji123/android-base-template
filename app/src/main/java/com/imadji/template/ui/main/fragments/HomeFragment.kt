package com.imadji.template.ui.main.fragments

import com.imadji.template.R
import com.imadji.template.common.onClick
import com.imadji.template.common.showFragment
import com.imadji.template.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_home

    override fun viewReady() {
        showDetailsButton.onClick {
            activity?.showFragment(DetailsFragment(), R.id.fragmentContainer, addToBackStack = true)
        }
    }

}
