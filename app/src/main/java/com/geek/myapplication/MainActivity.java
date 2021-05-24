package com.geek.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geek.myapplication.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        adapter = new ViewPagerAdapter(getSupportFragmentManager(),0);
        binding.vp.setAdapter(adapter);
        binding.tabs.setupWithViewPager(binding.vp);

    }
}