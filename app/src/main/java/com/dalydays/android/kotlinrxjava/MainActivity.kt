package com.dalydays.android.kotlinrxjava

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getNews().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

        TODO("Unsubscribe in onDestroy()")
    }

    fun getNews(): Observable<String> {
        return Observable.create { subscriber ->
            val news = "news string"
            subscriber.onNext(news)
            subscriber.onComplete()
        }
    }
}
