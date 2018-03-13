package com.melayer.homeautomation.login

import com.melayer.homeautomation.login.data.remote.LoginDataSource
import com.melayer.homeautomation.login.data.remote.LoginDataSourceImpl
import com.melayer.homeautomation.login.data.remote.LoginRepository
import com.melayer.homeautomation.login.data.remote.LoginRepositoryImpl
import com.melayer.homeautomation.login.mvp.LoginContract
import com.melayer.homeautomation.login.mvp.LoginPresenter
import org.koin.dsl.module.applicationContext

/**
 * Created by aniruddha on 9/3/18.
 */

val loginModule = applicationContext {

    bean {  LoginRepositoryImpl(get()) as LoginRepository }

    bean { LoginDataSourceImpl() as LoginDataSource }

    factory { _ -> LoginPresenter(get(), get()) as LoginContract.Presenter }
}
