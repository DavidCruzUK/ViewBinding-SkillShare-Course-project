package com.lastreact.myapplication.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.lastreact.myapplication.R
import com.lastreact.myapplication.databinding.FragmentMainContainerBinding

class MainContainerFragment: Fragment(R.layout.fragment_main_container) {

    private var _binding: FragmentMainContainerBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainContainerBinding.bind(view)
        binding.textViewContainer.text = "Hi Fragment Container!"
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}