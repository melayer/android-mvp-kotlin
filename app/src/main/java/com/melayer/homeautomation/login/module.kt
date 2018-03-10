package com.melayer.homeautomation.login

import com.melayer.homeautomation.login.mvp.LoginContract
import com.melayer.homeautomation.login.mvp.LoginPresenter
import org.koin.dsl.module.applicationContext

/**
 * Created by aniruddha on 9/3/18.
 */

val loginModule = applicationContext {
    factory { _ -> LoginPresenter(get()) as LoginContract.Presenter }
}
