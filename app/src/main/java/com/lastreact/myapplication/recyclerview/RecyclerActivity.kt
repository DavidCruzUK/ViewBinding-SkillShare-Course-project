package com.lastreact.myapplication.recyclerview

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lastreact.myapplication.databinding.ActivityCustomListBinding

class RecyclerActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCustomListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.customList.adapter = CustomAdapter()
        binding.customList.layoutManager = LinearLayoutManager(this)
    }

}