package com.melayer.homeautomation.login.mvp

import com.melayer.homeautomation.base.BasePresenter
import com.melayer.homeautomation.base.BaseView

/**
 * Created by aniruddha on 9/3/18.
 */

interface LoginContract {

    interface View : BaseView<Presenter> {
        fun toDash()
    }

    interface Presenter : BasePresenter<View> {
        fun callLogin()
    }
}
