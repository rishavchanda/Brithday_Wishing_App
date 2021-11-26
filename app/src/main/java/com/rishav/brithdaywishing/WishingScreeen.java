package com.rishav.brithdaywishing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rishav.brithdaywishing.databinding.ActivityWishingScreeenBinding;

public class WishingScreeen extends AppCompatActivity {

    //View Binding
    ActivityWishingScreeenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWishingScreeenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}