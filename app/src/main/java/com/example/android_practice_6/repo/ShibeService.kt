package com.example.android_practice_6.repo

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ShibeService {

    @GET("shibes")
    suspend fun fetchShibes(@Query("count") count: Int) : Response<List<String>>
}