package com.martynov.myvchat.ui.fragments


import androidx.fragment.app.Fragment
import com.martynov.myvchat.MainActivity
import com.martynov.myvchat.utilits.APP_ACTIVITY

open class BaseFragment(layout: Int) : Fragment(layout) {
    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.mAppDrawer.disableDrawer()

    }
}