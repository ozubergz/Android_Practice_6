package com.example.android_practice_6.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android_practice_6.databinding.ItemLayoutBinding

class ShibeAdapter(private val dataSet: List<String>) : RecyclerView.Adapter<ShibeAdapter.ShibeViewholder>() {

    class ShibeViewholder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(shibe: String) {
            Glide.with(itemView).load(shibe).into(binding.imageView);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShibeViewholder {
        val view = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShibeViewholder(view)
    }

    override fun onBindViewHolder(holder: ShibeViewholder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}