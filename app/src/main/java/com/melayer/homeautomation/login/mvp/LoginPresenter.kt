package com.melayer.homeautomation.login.mvp

import com.melayer.homeautomation.base.AbstractPresenter

/**
 * Created by aniruddha on 9/3/18.
 */

class LoginPresenter(
        override var view: LoginContract.View
) : AbstractPresenter<LoginContract.View, LoginContract.Presenter>(view), LoginContract.Presenter {

    override fun callLogin() {

    }
}