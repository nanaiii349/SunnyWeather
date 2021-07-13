package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    companion object {

        const val TOKEN = "Barmss6X0pJtLgf0" // 彩云天气API的令牌

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context // 定义了一个context变量
    }

    override fun onCreate() {
        super.onCreate()
        // applicationContext是getApplicationContext()方法得到的返回值
        context = applicationContext
    }

}
