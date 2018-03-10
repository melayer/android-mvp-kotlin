package com.melayer.homeautomation

import com.github.kittinunf.fuel.core.FuelManager
import org.koin.dsl.module.applicationContext

/**
 * Created by aniruddha on 9/3/18.
 */
val restModule = applicationContext {

    bean {
        FuelManager.instance.apply {
            basePath = "http://httpbin.org"
        }
    }
}