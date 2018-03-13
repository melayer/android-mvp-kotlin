package com.melayer.homeautomation.login.data.remote

import com.github.kittinunf.fuel.gson.gsonDeserializerOf
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.fuel.rx.rx_object
import com.melayer.homeautomation.login.data.domain.Login
import io.reactivex.Single

/**
 * Created by aniruddha on 10/3/18.
 */
interface LoginApi {
    fun login() : Single<Login>
    fun users() : Single<List<Login>>
}

class LoginWebServices : LoginApi {
    override fun login(): Single<Login> {
        return "login".httpGet()
                .rx_object(gsonDeserializerOf<Login>())
                .map { it.component1() ?: it.component1() ?: throw Exception() }
    }

    override fun users(): Single<List<Login>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}