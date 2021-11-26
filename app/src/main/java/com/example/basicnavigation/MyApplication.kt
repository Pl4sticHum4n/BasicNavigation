package com.example.basicnavigation

import android.app.Application
import com.example.basicnavigation.database.DatabaseManager

open class MyApplication: Application() {
    override fun onCreate() {
        DatabaseManager.instance.initializeDb(applicationContext)
        super.onCreate()
    }
}