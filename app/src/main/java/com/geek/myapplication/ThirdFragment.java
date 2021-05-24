package com.geek.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geek.myapplication.databinding.FragmentSecondBinding;
import com.geek.myapplication.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    public ThirdFragment() {
    }

    public static ThirdFragment newInstance(String param1, String param2) {
        return null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}