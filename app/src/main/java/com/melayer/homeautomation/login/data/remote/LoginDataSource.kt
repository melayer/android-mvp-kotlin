package com.melayer.homeautomation.login.data.remote

import com.github.kittinunf.fuel.gson.gsonDeserializerOf
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.rx.rx_object
import com.melayer.homeautomation.login.data.domain.Login
import io.reactivex.Single

/**
 * Created by aniruddha on 13/3/18.
 */
interface LoginDataSource {
    fun login() : Single<Login>
    fun users() : Single<List<Login>>
}

class LoginDataSourceImpl : LoginDataSource {
    override fun login(): Single<Login> {
        return "login".httpGet()
                .rx_object(gsonDeserializerOf<Login>())
                .map { it.component1() ?: it.component1() ?: throw Exception() }
    }

    override fun users(): Single<List<Login>> {
        return  Single.just(listOf())
    }
}