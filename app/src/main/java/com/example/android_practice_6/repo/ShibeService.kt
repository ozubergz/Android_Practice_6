package com.example.android_practice_6.repo

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ShibeService {

    @GET("shibes")
    fun fetchShibes(@Query("count") count: Int) : Call<List<String>>

}