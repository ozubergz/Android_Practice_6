package com.example.android_practice_6.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_practice_6.R
import com.example.android_practice_6.adapter.ShibeAdapter
import com.example.android_practice_6.databinding.ActivityMainBinding
import com.example.android_practice_6.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.fetchShibes(5)

        binding.apply {
            viewModel.shibes.observe(this@MainActivity, {
                rvList.apply {
                    adapter = ShibeAdapter(it)
                    layoutManager = LinearLayoutManager(context)
                }
            })
        }
    }
}