package com.example.android_practice_6.repo

import retrofit2.Call
import retrofit2.Response

object Repo {

    private val service = RetrofitInstance.shibeService

    suspend fun fetchShibes(count: Int) : Response<List<String>> {
        return service.fetchShibes(count)
    }
}