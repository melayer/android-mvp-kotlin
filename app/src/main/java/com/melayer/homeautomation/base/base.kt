package com.melayer.homeautomation.base

import android.support.annotation.CallSuper
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

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

open class AbstractPresenter<V : BaseView<P>, out P : BasePresenter<V>>(
        override var view: V
) : BasePresenter<V> {

    private val disposables = CompositeDisposable()

    fun lauch( job : () -> Disposable) {
        disposables.add(job())
    }

    @CallSuper
    override fun stop() {
        disposables.clear()
    }
}