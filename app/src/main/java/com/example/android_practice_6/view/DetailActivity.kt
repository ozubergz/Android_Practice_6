package com.example.android_practice_6.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.android_practice_6.databinding.ActivityDetailBinding
import com.example.android_practice_6.databinding.ItemLayoutBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val urlShibe = intent.getStringExtra("URL")
        Glide.with(applicationContext).load(urlShibe).into(binding.imageView)


    }
}