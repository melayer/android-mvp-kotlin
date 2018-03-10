package com.melayer.homeautomation.login.mvp

/**
 * Created by aniruddha on 9/3/18.
 */

class LoginPresenter(
        override var view: LoginContract.View
) : LoginContract.Presenter{

    override fun stop() {

    }

    override fun callLogin() {
        view.toDash()
    }
}