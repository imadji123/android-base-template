package com.imadji.template.ui.main.fragments

import com.imadji.template.R
import com.imadji.template.common.onClick
import com.imadji.template.common.showSnackbar
import com.imadji.template.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_details.*

class DetailsFragment : BaseFragment() {

    override fun getLayout(): Int = R.layout.fragment_details

    override fun viewReady() {
        showMessageButton.onClick {
            showSnackbar(getString(R.string.message_thank_you), detailsFragmentContainer)
        }
    }

}
