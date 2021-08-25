package com.martynov.myvchat.ui.fragments

import androidx.fragment.app.Fragment
import com.martynov.myvchat.R
import com.martynov.myvchat.databinding.FragmentChatsBinding
import com.martynov.myvchat.utilits.APP_ACTIVITY


class MainFragment : Fragment(R.layout.fragment_chats) {

    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "MYVChat"
        APP_ACTIVITY.mAppDrawer.enableDrawer()

    }
}