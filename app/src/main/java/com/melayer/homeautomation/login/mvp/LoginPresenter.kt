package com.melayer.homeautomation.login.mvp

import com.melayer.homeautomation.base.AbstractPresenter
import com.melayer.homeautomation.login.data.remote.LoginRepository

/**
 * Created by aniruddha on 9/3/18.
 */

class LoginPresenter(
        private val loginRepository: LoginRepository,
        override var view: LoginContract.View
) : AbstractPresenter<LoginContract.View, LoginContract.Presenter>(view), LoginContract.Presenter {

    override fun callLogin() {
        lauch {
            loginRepository.login().subscribe({
                    view.toDash()
                },{

                 }
            )
        }
    }
}