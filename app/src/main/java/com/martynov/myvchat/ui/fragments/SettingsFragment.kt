package com.martynov.myvchat.ui.fragments


import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.martynov.myvchat.MainActivity
import com.martynov.myvchat.R
import com.martynov.myvchat.activities.RegisterActivity
import com.martynov.myvchat.databinding.FragmentSettingsBinding
import com.martynov.myvchat.utilits.AUTH
import com.martynov.myvchat.utilits.replaceActivity


class SettingsFragment : BaseFragment(R.layout.fragment_settings) {

    private lateinit var mBinding: FragmentSettingsBinding



    override fun onResume() {
        super.onResume()
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.settings_action_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.settings_menu_exit ->{
                AUTH.signOut()
                (activity as MainActivity).replaceActivity(RegisterActivity())
            }
        }
        return true
    }
}