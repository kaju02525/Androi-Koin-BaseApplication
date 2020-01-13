package com.demo.data.remote.network

import com.demo.data.model.BaseModel
import com.demo.data.model.requestsmodel.RegisterModel
import com.demo.di.network.RetrofitCall
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by Farshid Abazari since 25/10/19
 *
 * Usage: a interface to define end points
 *
 * How to call: just add in appInjector and repositoryImpl that you wanna use
 *
 */
interface AuthApi {
    @POST("register")
    fun registerUser(@Body registerModel: RegisterModel) : RetrofitCall<BaseModel>
}