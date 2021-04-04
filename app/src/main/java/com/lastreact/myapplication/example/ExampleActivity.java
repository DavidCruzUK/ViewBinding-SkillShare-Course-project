package com.lastreact.myapplication.example;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.lastreact.myapplication.databinding.ActivityExampleBinding;

public class ExampleActivity extends AbstractActivity<ActivityExampleBinding> {

    @Override
    protected ActivityExampleBinding getBinding() {
        return ActivityExampleBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding.exampleJavaTv.setText("Example in java finished");
    }
}
