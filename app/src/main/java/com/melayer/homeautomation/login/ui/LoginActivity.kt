package com.melayer.homeautomation.login.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.melayer.homeautomation.R
import com.melayer.homeautomation.login.mvp.LoginContract
import com.melayer.homeautomation.login.mvp.LoginPresenter

class LoginActivity : AppCompatActivity(), LoginContract.View {

    private lateinit var presenter : LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun toDash() {
    }
}
