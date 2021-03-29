package com.example.android_practice_6.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android_practice_6.repo.Repo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel : ViewModel() {

    private val repo = Repo
    private val _shibes = MutableLiveData<List<String>>()

    val shibes : LiveData<List<String>>
        get() = _shibes

    fun fetchShibes(count: Int) {
        viewModelScope.launch(Dispatchers.IO) {
            val res = repo.fetchShibes(count)
            _shibes.postValue(res.body())
        }
    }
}

