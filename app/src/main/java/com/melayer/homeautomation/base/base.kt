package com.melayer.homeautomation.base

/**
 * Created by aniruddha on 9/3/18.
 */
interface BaseView<out T : BasePresenter<*>> {
    val presenter : T
}

interface BasePresenter<T> {

    fun stop()

    var view  : T
}