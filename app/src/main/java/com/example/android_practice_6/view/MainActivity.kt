package com.example.android_practice_6.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_practice_6.R
import com.example.android_practice_6.adapter.ClickListener
import com.example.android_practice_6.adapter.ShibeAdapter
import com.example.android_practice_6.databinding.ActivityMainBinding
import com.example.android_practice_6.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}