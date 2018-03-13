package com.melayer.homeautomation.login.data.remote

import com.melayer.homeautomation.login.data.domain.Login
import io.reactivex.Single

/**
 * Created by aniruddha on 10/3/18.
 */
interface LoginRepository {
    fun login() : Single<Login>
    fun users() : Single<List<Login>>
}

class LoginRepositoryImpl(
        private val loginDataSource : LoginDataSource
) : LoginRepository {
    override fun login() = loginDataSource.login()

    override fun users() = loginDataSource.users()
}