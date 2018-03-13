package com.melayer.homeautomation.login.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.melayer.homeautomation.R
import com.melayer.homeautomation.login.mvp.LoginContract
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject

class LoginActivity : AppCompatActivity(), LoginContract.View {

    override val presenter : LoginContract.Presenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnGo.setOnClickListener {
            presenter.callLogin()
        }
    }

    override fun toDash() {
        // this method is invoked from login presenter
    }
}
