package com.example.android_practice_6.repo

import retrofit2.Call

object Repo {

    private val service = RetrofitInstance.shibeService

    fun fetchShibes(count: Int) : Call<List<String>> {
        return service.fetchShibes(count)
    }
}