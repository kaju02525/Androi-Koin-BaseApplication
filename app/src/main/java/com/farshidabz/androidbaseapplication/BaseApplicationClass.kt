package com.demo

import android.app.Application
import com.demo.di.networkModule
import com.demo.di.repositoryModule
import com.demo.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


/**
 * Created by farshid.abazari since 2019-11-04
 *
 * Usage:
 *
 * How to call:
 *
 * Useful parameter:
 *
 */

class BaseApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@BaseApplicationClass)
            modules(listOf(repositoryModule, networkModule, viewModelModule))
        }
    }
}