package com.example.android_practice_6.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_practice_6.repo.Repo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    private val _shibes = MutableLiveData<List<String>>()

    val shibes : LiveData<List<String>>
        get() = _shibes

    fun fetchShibes(count: Int) {
        val call = Repo.fetchShibes(count)
        call.enqueue(object : Callback<List<String>> {
            override fun onResponse(call: Call<List<String>>, response: Response<List<String>>) {
                _shibes.postValue(response.body())
            }
            override fun onFailure(call: Call<List<String>>, t: Throwable) {
                Log.d("MainViewModel", "onFailure: ${t.message}")
            }
        })
    }
}

