package com.lastreact.myapplication.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lastreact.myapplication.R
import com.lastreact.myapplication.databinding.ItemCustomBinding

class CustomAdapter : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(private val binding: ItemCustomBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBindData(position: Int) {
            binding.textViewDemo.text = "this item has View Binding position: $position"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val binding = ItemCustomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CustomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.onBindData(position)
    }

    override fun getItemCount(): Int = 10
}