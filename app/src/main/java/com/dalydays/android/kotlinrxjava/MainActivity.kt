package com.dalydays.android.kotlinrxjava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createObservable()
    }

    fun createObservable() {
        var observableString: Observable<String> = Observable.just("this is my string")

        TODO("Subscribe to the observable")
        TODO("Run the observable code on a separate thread")
        TODO("Unsubscribe in onDestroy()")
    }
}
