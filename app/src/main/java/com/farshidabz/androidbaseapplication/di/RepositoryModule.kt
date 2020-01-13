package com.demo.di

import com.demo.data.repository.AuthRepo
import com.demo.data.repository.CatalogRepo
import com.demo.data.repository.GeneralRepo
import com.demo.data.repository.UserRepo
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


/**
 * Created by Farshid Abazari since 25/10/19
 *
 * Usage:
 *
 * How to call:
 *
 * Useful parameter:
 *
 */

val repositoryModule = module {
    single { AuthRepo(androidContext(), authApi = get()) }
    single { GeneralRepo(androidContext(), generalApi = get()) }
    single { UserRepo(androidContext(), userApi = get()) }
    single { CatalogRepo(androidContext(), catalogApi = get()) }

//    single { LocationHandler(get()) }
}