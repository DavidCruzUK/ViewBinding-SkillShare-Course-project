package com.lastreact.myapplication.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lastreact.myapplication.databinding.FragmentMainBinding
import com.lastreact.myapplication.databinding.FragmentMainContainerBinding
import com.lastreact.myapplication.main.base.BaseFragment

class MainContainerFragment : BaseFragment<FragmentMainContainerBinding>() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textViewContainer.text = "Hi Fragment Container!"
        binding.textViewOptional?.text = "This is only on portrait"
    }

    override fun createViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentMainContainerBinding =
        FragmentMainContainerBinding.inflate(inflater, container, false)

    override fun setupViews() = Unit

}