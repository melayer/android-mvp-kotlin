package com.melayer.homeautomation

import android.app.Application
import com.melayer.homeautomation.login.loginModule
import com.melayer.homeautomation.panda.pandaModule
import org.koin.android.ext.android.startKoin

/**
 * Created by aniruddha on 9/3/18.
 */
class HomeAutomationApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(
                this,
                listOf(
                        loginModule,
                        pandaModule,
                        restModule
                )
        )
    }
}