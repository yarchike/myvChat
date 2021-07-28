package com.martynov.myvchat.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.martynov.myvchat.R
import androidx.appcompat.widget.Toolbar
import com.martynov.myvchat.databinding.ActivityRegisterBinding
import com.martynov.myvchat.ui.fragments.EnterPhoneNumberFragment
import com.martynov.myvchat.utilits.initFirebase
import com.martynov.myvchat.utilits.replaceFragment

class RegisterActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityRegisterBinding
    private lateinit var mToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        initFirebase()
    }

    override fun onStart() {
        super.onStart()
        mToolbar = mBinding.registerToolbar
        setSupportActionBar(mToolbar)
        title = getString(R.string.register_title_your_phone)
        replaceFragment(EnterPhoneNumberFragment(), false)

    }
}