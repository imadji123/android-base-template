package com.imadji.template.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.imadji.template.navigation.FragmentNavigator
import com.imadji.template.navigation.NavigationFactory

abstract class BaseFragment : Fragment() {

    protected val appFragmentNavigator: FragmentNavigator by lazy { NavigationFactory.provideFragmentNavigator(activity) }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(getLayout(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewReady()
    }

    abstract fun getLayout(): Int

    abstract fun viewReady()

}
