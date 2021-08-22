package com.martynov.myvchat.ui.fragments

import androidx.fragment.app.Fragment
import com.martynov.myvchat.R
import com.martynov.myvchat.databinding.FragmentChatsBinding
import com.martynov.myvchat.utilits.APP_ACTIVITY


class ChatsFragment : Fragment(R.layout.fragment_chats) {

    private lateinit var mBinding: FragmentChatsBinding


    override fun onResume() {
        super.onResume()
        APP_ACTIVITY.title = "Чаты"

    }
}