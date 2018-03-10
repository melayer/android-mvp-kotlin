package com.melayer.homeautomation.base

/**
 * Created by aniruddha on 9/3/18.
 */
interface BaseView<out t : BasePresenter<*>>

interface BasePresenter<T> {

    fun stop()

    var view  : T
}