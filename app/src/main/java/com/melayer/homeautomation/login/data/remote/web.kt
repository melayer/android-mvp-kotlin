package com.melayer.homeautomation.login.data.remote

import com.github.kittinunf.fuel.core.FuelError
import com.github.kittinunf.fuel.core.Handler
import com.github.kittinunf.fuel.core.Request
import com.github.kittinunf.fuel.core.Response
import com.github.kittinunf.fuel.httpGet
import java.nio.charset.Charset

/**
 * Created by aniruddha on 9/3/18.
 */

fun get() {
    "".httpGet().responseString(Charset.defaultCharset(), object : Handler<String> {
        override fun failure(request: Request, response: Response, error: FuelError) {
        }

        override fun success(request: Request, response: Response, value: String) {
        }
    })
}